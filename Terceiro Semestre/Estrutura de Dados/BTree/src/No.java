public class No<T extends Comparable<T>>{
    private T dado;
    private No<T> esq;
    private No<T> dir;

    public No(T dado) {
        this.dado = dado;
    }

    public void inserirNo(T dado) {
        if(dado.compareTo(this.dado) > 0) {
            dir = new No<>(dado);
        }
        else {
            dir.inserirNo(dado);
        }
        else if {dad}
    }

}
