abstract class Entite {
    protected int resistance;

    public Entite() {
        resistance = 3;
    }

    public abstract String toString(String background);

    public void damage() {
        this.resistance -= 1;
    }
}
