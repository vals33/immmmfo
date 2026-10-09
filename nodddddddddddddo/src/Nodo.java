public class Nodo<T> {
    private  T dato;
    private Nodo succ;

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSucc() {
        return succ;
    }

    public void setSucc(Nodo succ) {
        this.succ = succ;
    }

    public Nodo(T dato){
        this.dato = dato;
        this.succ = null;
    }

    public Nodo(T nodo, Nodo succ){
        this.dato = dato;
        this.succ = succ;
    }

    
}
