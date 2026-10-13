public class Lista <T>{
    private class Nodo{
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

    private Nodo testa;  //primo nodo disponibile nella lista

    public Lista() {
        this.testa =  null;
    }

    public int lenght(){
        int l = 0; //lunghezza lista
        Nodo scan = this.testa; //questo nodo ora è la testa
        while(scan != null){
            l++;
            scan = scan.getSucc(); //ci spostiamo
        }
        return l; //ritorna la lunghezza della lista
    }

    public T extract(int i){
        if(i<0 || i>= this.lenght()) throw new IndexOutOfBoundsException();
        Nodo ext = this.testa;
        for (int j = 0; j < i; j++) {
            ext = ext.getSucc();
        }
        return ext.getDato();
    }

    public void insert(T dato, int i){
        if(i<0 || i > this.lenght()){
            throw new IndexOutOfBoundsException();
        }
        if(this.testa == null){
            this.testa = new Nodo(dato, null);
        } else if (i == 0){
            Nodo nuovo = new Nodo(dato, this.testa);
            this.testa = nuovo;
        }
        else{
            Nodo scan = this.testa;
            for (int j = 0; j < i-1; j++) {
                scan = scan.getSucc();
            }
            Nodo nuovo = new Nodo(dato, scan.getSucc());
            scan.setSucc(nuovo);
        }
    }

    public void add(T dato){
        this.insert(dato, this.lenght());
    }

    public void remove(int in){
        if(in<0 || in> this.lenght())  throw new IndexOutOfBoundsException();
        else if(in== 0) {
            this.testa = this.testa.getSucc();
        }
        else{
            Nodo scan = this.testa;
             for (int i = 0; i < in-1; i++) {
                scan = scan.getSucc();
            }
            scan.setSucc(scan.getSucc().getSucc());
        
        }
    }

}

/*
Partendo dal codice allegato, implementare il metodo 

public T get(int i)

che dato un intero i restituisce l'elemento posizionato all'i-esimo nodo della lista.
Si ricorda che, come per gli array, il primo elemento si trova in posizione 0.
Implementare meccanismi di controllo che impediscano l'estrazione di elementi in posizioni non esistenti (si lanci un'eccezione IndexOutOfBoundsException in caso di necessità).
*/
