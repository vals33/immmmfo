public class Listaordinabile <T extends Comparable<T>> extends Lista<T> {
    
    public void insertohordinatoh(T element, int p){
        int l = this.length();
        if (p < 0 || p > l) {
            throw new IndexOutOfBoundsException("Posizione " + p + " fuori dai limiti");
        }
        Nodo s = this.head;
        Nodo swapp = null;
        while (true) { 
            if(this.head == null){
                this.head = new Nodo(data);
                break;
            } else if(s == null || data.compareTo(s.getData())<0){
                break;
            }
            swapp = s;
            s = s.getNext();
        }
        Nodo n = new Nodo(data, s);
        if(s!= this.head){
            swapp.setNext(n);
        } else { this.head = n;}
    }

    

    public static void main(String[] args) {
        Listaordinabile<String> d = new Listaordinabile<>();
        d.insert("aa", 0);
        d.insert("cc", 0);
        d.insert("bb", 0);
        d.stampaLista();
    }

    
}
