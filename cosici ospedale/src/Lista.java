import java.util.Iterator;

public class Lista<T> implements Iterable<T> {

    public Lista(Nodo head, Nodo testa) {
        this.head = head;
        this.testa = testa;
    }

    
        private class Iteratore implements Iterator<T> {

        private Nodo cursore;

        public Iteratore() {
            cursore = head;
        }

        @Override
        public boolean hasNext() {
            return cursore != null;
        }

        @Override
        public T next() {
            T temp = cursore.getData();
            cursore = cursore.getNext();
            return temp;
        }

        

    }
    
     @Override
    public Iterator<T> iterator() {
        return new Iteratore();
    }

    public void stampa() {
        this.forEach(t -> System.out.println(t + " ") );
        System.out.println("");
    }

    protected Nodo testa;

    protected void swap(int pos1, int pos2) {
        Nodo temp1 = null, temp2 = null, temp3 = testa;
        for (int i = 0; i < pos2; i++) {
            temp1 = temp2;
            temp2 = temp3;
            temp3 = temp3.getNext();
        }
        if (temp1 == null) {
            temp2.setNext(temp3.getNext());
            temp3.setNext(temp2);
            testa = temp3;
        }
        else {
            temp1.setNext(temp3);
            temp2.setNext(temp3.getNext());
            temp3.setNext(temp2);
        }
    }

    class Nodo {
        private T data;
        private Nodo next;
         
        public Nodo(T data) {
            this.data = data;
            this.next = null;
        }        

        public Nodo(T data, Nodo next) {
            this.data = data;
            this.next = next;
        }

        public T getData() { return this.data; }

        public Nodo getNext() { return this.next; }

        public void setNext(Nodo next) { this.next = next; }
    }

     Nodo head;

    public Lista() { this.head = null; }

    public int length() {
        Nodo scan = this.head;
        int i = 0;
        while (scan != null) {
            i++;
            scan = scan.getNext();
        }
        return i;
    }
     
    public T get(int p) {
        int l = this.length();
        if (p < 0 || p >= l) {
            throw new IndexOutOfBoundsException("Posizione " + p + " fuori dai limiti");
        }

        else {
            Nodo scan = this.head;
            for (int i = 0; i < p; i++) {
                scan = scan.getNext();
            }

            return scan.getData();
        }
    }

    public void insert(T element, int p) {
        int l = this.length();
        if (p < 0 || p > l) {
            throw new IndexOutOfBoundsException("Posizione " + p + " fuori dai limiti");
        } else if (p == 0) {
            this.head = new Nodo(element, this.head);
        } else {
            Nodo scan = this.head;
            for (int i = 0; i < p - 1; i++) {
                scan = scan.getNext();
            }
            Nodo nuovo = new Nodo(element, scan.getNext());
            scan.setNext(nuovo);
        }
    }

    public void add(T element) {
        this.insert(element, this.length());
    }

    public void remove(int p) {
        int l = this.length();
        if (p < 0 || p >= l) {
            throw new IndexOutOfBoundsException("Posizione " + p + " fuori dai limiti");
        } else if (p == 0) {
            this.head = this.head.getNext();
        } else {
            Nodo scan = this.head;
            for(int i = 0; i < p - 1; i++) {
                scan = scan.getNext();
            }
            scan.setNext(scan.getNext().getNext());
        }
    }

    public void stampaLista() {
        Nodo scan = this.head;
        for (int i = 0; i < this.length(); i++) {
            System.out.print(scan.getData()+" | ");
            scan=scan.getNext();
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Lista<Integer> ints = new Lista<>();
        ints.add(5);
        ints.add(230);
        ints.add(4);
        ints.insert(100, 0);
        ints.remove(3);
        
    }

    
}

//Sulla base del codice allegato, creare una versione della lista concatenata che consenta il mantenimento di una lista ordinata (sorted).
