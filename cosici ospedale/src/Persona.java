public class Persona implements Comparable<Persona>{
    Codici c;
    String nome;
    String sesso;
    int età;
    boolean handicsp;
    boolean incint;

    public Persona(Codici c, int età, boolean handicsp, boolean incint, String nome, String sesso) {
        this.c = c;
        this.età = età;
        this.handicsp = handicsp;
        this.incint = incint;
        this.nome = nome;
        this.sesso = sesso;
    }

    @Override
    public int compareTo(Persona o) {
        if(this.c.getNum()<o.getT().getNum()) return -1;
        if(this.c.getNum()==o.getT().getNum()) return 0;
        return 1;
    }

    public Codici getT(){
        return c;
    }



}
 