import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        Stack<Vinho> pilha = new Stack<>();
        Stack<Vinho> aux = new Stack<>();

        pilha.push(new Vinho(" Romaneé Conti", 15000));
        pilha.push(new Vinho(" Rosé Piscine", 66));
        pilha.push(new Vinho(" Crose Hermitage", 500));
        pilha.push(new Vinho(" Mouton", 50000));
        pilha.push(new Vinho(" Petrus", 50000));

        for(int i = pilha.size(); i <= pilha.size() - 3; i++) {
            aux.push(pilha.pop());
        }

        for (Vinho v : aux) {
            System.out.println(v);
        }

        for(Vinho v : pilha) {
            System.out.println(v);
        }

        while(!aux.isEmpty()) {
            pilha.push(aux.pop());
        }

    }

}