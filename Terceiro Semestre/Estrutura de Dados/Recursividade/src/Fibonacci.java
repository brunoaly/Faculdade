import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicao;

        System.out.println("Posição: ");
        posicao = sc.nextInt();

        int valor = fib(posicao);
        System.out.println(valor);
    }

    private static int fib(int posicao) {
        if(posicao == 1 || posicao == 2) return 1;
        return fib(posicao - 1) + fib(posicao - 2);
    }

}
