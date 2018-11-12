import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Person[] personenListe = new Person[1000];
        int personenAnzahl = 0;
        String auswahl;

        do {
            System.out.println();
            System.out.println("1 - Eingabe eines Schülers");
            System.out.println("2 - Eingabe eines Studenten");
            System.out.println("3 - Ausgabe der Liste am Bildschirm");
            System.out.println("4 - Ausgabe aller Schüler am Bildschirm");
            System.out.println("5 - Ausgabe aller Studenten am Bildschirm");
            System.out.println("6 - Ende");

            auswahl = sc.nextLine();

            switch (auswahl) {
                case "1":
                    personenListe[personenAnzahl] = readSchueler();
                    personenAnzahl++;
                    break;
                case "2":
                    personenListe[personenAnzahl] = readStudent();
                    personenAnzahl++;
                    break;
                case "3":
                    printPersonen(personenListe, personenAnzahl);
                    break;
                case "4":
                    printSchueler(personenListe, personenAnzahl);
                    break;
                case "5":
                    printStudenten(personenListe, personenAnzahl);
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Ungültige Eingabe!");
            }

        } while (!auswahl.equals("6"));
    }


    static Schueler readSchueler() {
        System.out.print("Vorname: ");
        String vorname = sc.nextLine();

        System.out.print("Nachname: ");
        String nachname = sc.nextLine();

        System.out.print("Schule: ");
        String schule = sc.nextLine();

        System.out.print("Klasse: ");
        String klasse = sc.nextLine();

        System.out.print("Katalognummer: ");
        int katalogNr = Integer.valueOf(sc.nextLine());

        return new Schueler(vorname, nachname, schule, klasse, katalogNr);
    }

    static Student readStudent() {
        System.out.print("Vorname: ");
        String vorname = sc.nextLine();

        System.out.print("Nachname: ");
        String nachname = sc.nextLine();

        System.out.print("Universität: ");
        String universitaet = sc.nextLine();

        System.out.print("Katalognummer: ");
        int matrikelNr = Integer.valueOf(sc.nextLine());

        System.out.print("Studienfach: ");
        String studienfach = sc.nextLine();

        return new Student(vorname, nachname, universitaet, matrikelNr, studienfach);
    }

    static void printPersonen(Person[] personenListe, int personenAnzahl) {
        for (int i = 0; i < personenAnzahl; i++) {
            if (personenListe[i] instanceof Student) {
                System.out.println("Student:");
            } else if (personenListe[i] instanceof Schueler) {
                System.out.println("Schüler:");
            }

            System.out.println(personenListe[i]);
            System.out.println();
        }
    }

    static void printSchueler(Person[] personenListe, int personenAnzahl) {
        for (int i = 0; i < personenAnzahl; i++) {
            if (personenListe[i] instanceof Schueler) {
                System.out.println(personenListe[i]);
                System.out.println();
            }
        }
    }

    static void printStudenten(Person[] personenListe, int personenAnzahl) {
        for (int i = 0; i < personenAnzahl; i++) {
            if (personenListe[i] instanceof Student) {
                System.out.println(personenListe[i]);
                System.out.println();
            }
        }
    }
}
