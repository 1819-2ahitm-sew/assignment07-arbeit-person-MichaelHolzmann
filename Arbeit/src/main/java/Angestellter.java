public class Angestellter extends Arbeitnehmer {
    double gehalt;

    @Override
    public double getEntgelt() {
        return gehalt;
    }

    // region Getter / Setter

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    // endregion
}
