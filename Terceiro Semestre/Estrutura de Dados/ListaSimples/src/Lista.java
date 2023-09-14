public class Lista {
    No inicio, fim;
    int tamanho;

    public void inserir(int idade) {
        No aux = new No();
        aux.idade = idade;
        if (inicio == null) {
            inicio = aux;
        } else {
            fim.prox = aux;
        }
        tamanho++;
        fim = aux;
    }

    public void imprimir() {
        No aux = inicio;
        while(aux != null) {
            System.out.println();
            aux = aux.prox;
        }
    }

}
