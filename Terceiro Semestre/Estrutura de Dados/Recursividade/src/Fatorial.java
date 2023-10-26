import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Valor inteiro: ");
        valor = sc.nextInt();

        int fat = fatorial(valor);
        System.out.println(fat);

    }

    private static int fatorial(int valor) {
        if (valor == 0)
            return 1;
        return valor * fatorial(valor - 1);
    }
}
