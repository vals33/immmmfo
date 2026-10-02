import java.util.NoSuchElementException;

public class Cella <T> implements Contenitore<T>{

    T elemento;

    public Cella(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public void inserisciElemento(T elemento) {
        if(!elementoVuoto()){
            throw new IllegalStateException("cella occupats");
        }
        else{ inserisciElemento(elemento); }
    }

    @Override
    public void estraiElemento(T elemento) {
        if(elemento == null){
            throw new NoSuchElementException("non c'è elements");
        }

        else{ estraiElemento(elemento);}
    }

    @Override
    public boolean elementoVuoto() {
        return (boolean) (this.elemento = null);
    
    }
    
}
