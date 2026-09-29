//riporta l'anno di uscita nelle sale, il nome del regista e i
//nomi dei due attori principali

public class Cinema extends Passionisioni implements Classificabile{
    int annouscita;
    String nomeregista;
    String attfemminile;
    String attmaschile;

    public Cinema(String titolo) {
        super(titolo);
    }

    public Cinema(int annouscita, String attfemminile, String attmaschile, String nomeregista, String titolo2) {
        super(titolo2);
        this.annouscita = annouscita;
        this.attfemminile = attfemminile;
        this.attmaschile = attmaschile;
        this.nomeregista = nomeregista;
    }

    

    @Override
    public String nomeClassifica() {
        return(" film di " + nomeregista + "( starring " + attmaschile + " " + attfemminile + ")");
    }

    public int getAnnouscita() {
        return annouscita;
    }

    public void setAnnouscita(int annouscita) {
        this.annouscita = annouscita;
    }

    public String getNomeregista() {
        return nomeregista;
    }

    public void setNomeregista(String nomeregista) {
        this.nomeregista = nomeregista;
    }

    public String getAttfemminile() {
        return attfemminile;
    }

    public void setAttfemminile(String attfemminile) {
        this.attfemminile = attfemminile;
    }

    public String getAttmaschile() {
        return attmaschile;
    }

    public void setAttmaschile(String attmaschile) {
        this.attmaschile = attmaschile;
    }
    
}
