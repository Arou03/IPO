abstract class Case {
    final int lig, col;

    public Case(int lig, int col) {
        this.lig = lig;
        this.col = col;
    }

    public abstract boolean estLibre();
}
