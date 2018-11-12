public abstract class Arbeitnehmer {

    private String beruf;
    private String arbeitgeber;

    public abstract double getEntgelt();

    // region Getter and Setter

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public String getArbeitgeber() {
        return arbeitgeber;
    }

    public void setArbeitgeber(String arbeitgeber) {
        this.arbeitgeber = arbeitgeber;
    }

    // endregion
}