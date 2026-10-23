
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FileLista implements Comparable{

    public FileLista(File file) {
        this.file = file;
    }
    /*Sulla base del codice visto fino ad ora (Lista e ListaOrdinabile), implementare un programma Java che:
Legga un file di testo contenente, per ogni riga, un nome e un numero rappresentante l'età;
Scriva un file di testo con i dati del file precedente ma ordinati in ordine alfabetico rispetto al nome.
Si crei un oggetto specifico per gestire i dati (si suggerisce di usare anche l'interfaccia Comparable...) e si utilizzi una Lista o una ListaOrdinabile 
per lo svolgimento.
Per la lettura e la scrittura dei file, riferirsi alle API di Java pubblicate da Oracle.*/


    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    File file;

    public List<String> readFile() throws FileNotFoundException{
        SortedList<String> dati = new SortedList<>();
        Scanner s = new Scanner(file);
        while(s.hasNext()){
            dati.sortedInsert(s.nextLine());
        }
        s.close();
        return dati;
    }

    // Listato 2. Scrittura di un file
    public static void writeFile(SortedList<String> s) {
        
        try {
            File file = new File(path);
            FileWriter fw = new FileWriter(file);
            fw.write("Questo è un file con nomssss");
            for (int j = 0; j < s.length(); j++) {
                fw.write(s.extract(i));
                fw.flush();
            }
            
            
            fw.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = "Download";
        FileLista f = new FileLista(path);
        f.readFile();
        f.writeFile(null);
    }
    

}
