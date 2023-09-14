public class Lista {
    No inicio, fim;
    int tamanho;

    public void inserirInicio(int ra, String nome) {
        No aux = new No();
        aux.ra = ra;
        aux.nome = nome;

        if (inicio == null) {
            inicio = aux;
            fim = aux;
        } else {
            aux.dir = inicio;
            inicio.esq = aux;
        }
        tamanho++;
        inicio = aux;
    }

    public void imprimir() {
        No aux = inicio;

        while (aux != null) {
            System.out.println("RA --> " + aux.ra);
            System.out.println("Nome --> " + aux.nome);
            System.out.println();
            aux = aux.dir;
        }
    }
}