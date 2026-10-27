


public class Main {
    public static void main(String[] args) throws Exception {
        SortedList<Persona> p = new SortedList<>();
        Persona p1 = new Persona(Codici.Azzurro, 13, false, false, "lala", "maschio");
        Persona p2 = new Persona(Codici.Rosso, 14, false, false, "nico", "femmina");
        p.insertSorted(p1);
        p.insertSorted(p2);
        p.forEach(a-> System.out.println(a));
        
    }
}
