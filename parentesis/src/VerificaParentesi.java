


import java.util.Scanner;
import java.util.Stack;

public class VerificaParentesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ciao! Benvenuto nell'analizzatore di espressioni di ZucSoftware Inc.");

        while (true) {
            System.out.print("\nScrivi pure l'espressione da controllare (oppure scrivi 'esci' per chiudere): ");
            String espressione = scanner.nextLine();

            if (espressione.equalsIgnoreCase("esci")) {
                System.out.println("Grazie per aver usato il nostro programma. A presto!");
                break;
            }

            if (controllaParentesi(espressione)) {
                System.out.println("Ottimo lavoro! Tutte le parentesi sono al posto giusto.");
            } else {
                System.out.println("Ops, c'è qualcosa che non va: le parentesi non tornano, controllale meglio!");
            }
        }

        scanner.close();
    }

    public static boolean controllaParentesi(String espressione) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < espressione.length(); i++) {
            char carattere = espressione.charAt(i);

            if (carattere == '(' || carattere == '[' || carattere == '{') {
                pila.push(carattere);
            } else if (carattere == ')' || carattere == ']' || carattere == '}') {
                if (pila.isEmpty()) {
                    return false;
                }

                char ultimaAperta = pila.pop();

                if (!sonoCorrispondenti(ultimaAperta, carattere)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    private static boolean sonoCorrispondenti(char aperta, char chiusa) {
        return (aperta == '(' && chiusa == ')') ||
               (aperta == '[' && chiusa == ']') ||
               (aperta == '{' && chiusa == '}');
    }
}


