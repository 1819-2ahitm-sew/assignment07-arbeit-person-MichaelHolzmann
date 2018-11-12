import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Arbeitnehmer[] liste = new Arbeitnehmer[1000];
        int anzahl = 0;
        String auswahl;

        do {
            System.out.println();
            System.out.println("1 - Eingabe eines Arbeiters");
            System.out.println("2 - Eingabe eines Angestellten");
            System.out.println("3 - Ausgabe der gesamten Liste");
            System.out.println("4 - Programmende");
            auswahl = scanner.nextLine();

            switch (auswahl){
                case "1":
                    liste[anzahl] = readArbeiter();
                    anzahl++;
                    break;
                case "2":
                    liste[anzahl] = readAngestellter();
                    anzahl++;
                    break;
                case "3":
                    printListe(liste, anzahl);
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
            }

        } while (!auswahl.equals("4"));
    }

    static Arbeiter readArbeiter(){
        Arbeiter arbeiter = new Arbeiter();

        System.out.print("Arbeitgeber: ");
        String arbeitgeber = scanner.nextLine();
        arbeiter.setArbeitgeber(arbeitgeber);

        System.out.print("Beruf: ");
        String beruf = scanner.nextLine();
        arbeiter.setBeruf(beruf);

        System.out.print("Stundenlohn: ");
        double stundenlohn = Double.valueOf(scanner.nextLine());
        arbeiter.setStundenlohn(stundenlohn);

        return arbeiter;
    }

    static Angestellter readAngestellter(){
        Angestellter angestellter = new Angestellter();

        System.out.print("Arbeitgeber: ");
        String arbeitgeber = scanner.nextLine();
        angestellter.setArbeitgeber(arbeitgeber);

        System.out.print("Beruf: ");
        String beruf = scanner.nextLine();
        angestellter.setBeruf(beruf);

        System.out.print("Gehalt: ");
        double gehalt = Double.valueOf(scanner.nextLine());
        angestellter.setGehalt(gehalt);

        return angestellter;
    }

    static void printListe(Arbeitnehmer[] liste, int anzahl){
        for (int i = 0; i < anzahl; i++) {
            if (liste[i] instanceof Arbeiter){
                System.out.println("Arbeiter");
            } else {
                System.out.println("Angestellter");
            }

            System.out.println("Arbeitgeber: " + liste[i].getArbeitgeber());
            System.out.println("Beruf: " + liste[i].getBeruf());
            System.out.println("Entgelt: " + liste[i].getEntgelt());
            System.out.println();
        }
    }
}
