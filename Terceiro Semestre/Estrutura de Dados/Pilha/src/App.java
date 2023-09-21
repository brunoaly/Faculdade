import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        
        Stack<String> lista = new Stack<>();
        lista.push("Pedro");
        lista.push("Carol");
        lista.push("Rafael");

        System.out.println(lista);

        lista.pop();

        System.out.println(lista);
    
    }
}
