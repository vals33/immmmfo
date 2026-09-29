public class Musica extends Passionisioni implements Classificabile{
    String artista;
    int tracce;

    public Musica(String titolo) {
        super(titolo);
    }

    

    @Override
    public String nomeClassifica() {
        return (" " + artista + "-" + this.titolo);
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getTracce() {
        return tracce;
    }

    public void setTracce(int tracce) {
        this.tracce = tracce;
    }
    
}
