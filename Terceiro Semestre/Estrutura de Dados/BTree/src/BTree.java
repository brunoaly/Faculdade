public class BTree<T> {

    private No<T> raiz;    

    public void inserir(T dado) {
        if (raiz == null){
            raiz = new No<>(dado);
        }
        else {
            raiz.inserirNo(dado);
        }
    }
    
}