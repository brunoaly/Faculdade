public class App {
    public static void main(String[] args) throws Exception {

        Lista<Aluno> lista = new Lista<>();
        Aluno a1 = new Aluno(1, "Selmini");
        Aluno a2 = new Aluno (2, "Luiz");
        Aluno a3 = new Aluno(3, "Maria");

        lista.inserirInicio((a1));
        lista.inserirInicio((a2));
        lista.inserirInicio((a3));

        lista.imprimir();
        
        lista.remover(a2);

        lista.imprimir();
        
        
    }
    
}
