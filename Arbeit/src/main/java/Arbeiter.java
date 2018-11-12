public class Arbeiter extends Arbeitnehmer {
    double stundenlohn;

    @Override
    public double getEntgelt() {
        return stundenlohn * 40;
    }

    // region Getter / Setter

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    // endregion
}
