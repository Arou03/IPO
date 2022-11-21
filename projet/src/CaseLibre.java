public class CaseLibre extends CaseTraversable {

    public CaseLibre(int lig, int col) {
        super(lig, col);
    }
    public CaseLibre(int lig, int col, Entite e) {
        super(lig, col);
        this.contenu = e;
    }

    @Override
    public String toString() {
        if (this.contenu == null) {
            return "   ";
        } else {
            if(this.contenu.resistance <= 0) {
                this.vide();
                return "   ";
            } else {
                return this.contenu.toString("   ");
            }
        }
    }
}
