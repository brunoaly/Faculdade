public class Ex2 {

    public static void main(String[] args) {

        int limite = 4000000;

        int a = 1;

        int b = 2;

        int soma = 0;

        while (a <= limite) {
            int aux = a;

            if (a % 2 == 0) {
                soma += a;
            }

            a = b;
            b = a + aux;

            System.out.println(soma);

        }

    }

}
