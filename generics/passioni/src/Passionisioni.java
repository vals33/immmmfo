/*
Tutte le passioni sono organizzate in modo da essere rappresentate da un titolo. Se viene
richiesta la rappresentazione in forma di String, riportano tale titolo racchiuso tra virgolette
(es. se il titolo èIl Codice da Vinci la rappresentazione in forma di stringa è“Il Codice da Vinci”).
*/
public class Passionisioni <t>{
    String titolo;
    String categoria;

    public void classificabili(String titolo, String categoria){
        System.out.print("[" + categoria + "]" + " '' " + titolo + " '' ");
    }

    public Passionisioni(String titolo2) {
        this.titolo = titolo2;
    }

    @Override
    public String toString() {
        return "\"" + titolo + "\"";
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Passionisioni))
            return false;

        Passionisioni altra = (Passionisioni) obj;

        return titolo.equals(altra.titolo);
    }

    

    
    
}
