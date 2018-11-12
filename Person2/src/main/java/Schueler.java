public class Schueler extends Person {

    private String schule;
    private String klasse;
    private int katalogNr;

    public Schueler(String vorname, String nachname, String schule, String klasse, int katalogNr) {
        super(vorname, nachname);

        this.schule = schule;
        this.klasse = klasse;
        this.katalogNr = katalogNr;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("\n");
        sb.append("Schule: ");
        sb.append(schule);
        sb.append("\n");
        sb.append("Klasse: ");
        sb.append(klasse);
        sb.append("\n");
        sb.append("Katalognummer: ");
        sb.append(katalogNr);

        return sb.toString();
    }
}
