public class Libri extends Passionisioni implements Classificabile{
    String autore;
    int numpagine;
    String ISBN;

    public Libri(String titolo2, String autore, int numpagine, String iSBN) {
        super(titolo2);
        this.autore = autore;
        this.numpagine = numpagine;
        ISBN = iSBN;
    }



    public Libri(String titolo) {
        super(titolo);
    }

    

    @Override
    public String nomeClassifica() {
        return(autore + " '' " + this.titolo + " '' ( ISBN: " + ISBN + ")" );
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumpagine() {
        return numpagine;
    }

    public void setNumpagine(int numpagine) {
        this.numpagine = numpagine;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
}
