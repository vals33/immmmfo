public class Locomotiva extends Vagone{
    String alimentzione;
    int potenza;

    public Locomotiva(String alimentzione, int potenza, int numeroPassegiers) {
        super(numeroPassegiers);
        this.alimentzione = alimentzione;
        this.potenza = potenza;
    }

    
}
