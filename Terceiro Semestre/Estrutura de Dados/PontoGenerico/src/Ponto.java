//classe genérica ou paramétrizada 

public class Ponto<T> {
    T x;
    T y;

    public Ponto(T x, T y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}
