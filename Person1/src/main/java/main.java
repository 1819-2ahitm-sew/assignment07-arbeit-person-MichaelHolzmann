import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Person[] bewohner = readBewohner();

        for (int i = 0; i < bewohner.length; i++) {
            System.out.println(bewohner[i].toString());
        }
    }

    static Person[] readBewohner() {
        Person[] bewohner = new Person[readBewohneranzahl()];
        String zeile;
        String[] namen;
        int anzahl = 0;

        try (Scanner scanner = new Scanner(new FileReader("../personen.csv"))) {
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                zeile = scanner.nextLine();
                namen = zeile.split(";");
                bewohner[anzahl] = new Person(namen[0], namen[1]);
                anzahl++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        return bewohner;
    }

    static int readBewohneranzahl() {
        int anzahl = 0;

        try (Scanner scanner = new Scanner(new FileReader("../personen.csv"))) {
            scanner.nextLine(); // ignore first line

            while (scanner.hasNextLine()) {
                scanner.nextLine();
                anzahl++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        return anzahl;
    }
}
