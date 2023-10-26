import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long base, expoente, resultado;

        System.out.println(("Base --> "));
        base = sc.nextLong();

        System.out.println("Expoente --> ");
        expoente = sc.nextLong();

        resultado = calcular(base, expoente);
        
    }

    private static long calcular(long base, long expoente) {
        if(expoente == 0) {
            return 1;
        }

        return base * calcular(base, expoente - 1); 
    }

}