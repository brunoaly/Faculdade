import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        int valor;

        System.out.println("Informe um valor inteiro e positivo: ");
        valor = scanner.nextInt();

        while (valor > 0) {
            pilha.push(valor % 2);
            valor = valor / 2;
        }

        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }

        scanner.close();
    
    }

}