public class CaseIntraversable extends Case{
    public CaseIntraversable(int lig, int col) {
        super(lig, col);
    }

    @Override
    public boolean estLibre() {
        return false;
    }

    @Override
    public String toString() {
        return "###";
    }
}
