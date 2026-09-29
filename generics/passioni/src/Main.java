public class Main {
    public static void main(String[] args) {
        Libri l = new Libri("quando un sogno si avvera", "nicholas sparks", 259, "DUC321");
        Musica m = new Musica(" alex warren", 1, "crying wolf");
        Cinema c = new Cinema(2016, "kate blanchet", "orlando bloom", "spielberg", "LO HOBBIT");
        Passionisioni p = new Passionisioni<>("lala");
        Classificscs cla;
        p.classificabili("quando un sogno si avvera", "libri");
        cla.aggiungiClassifica();
    }
}
