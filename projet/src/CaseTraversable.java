public class CaseTraversable extends Case{
    Entite contenu;
    public CaseTraversable(int lig, int col) {
        super(lig, col);
        contenu = null;
    }

    Entite getContenu() {
        return contenu;
    }

    public void vide() {
        contenu = null;
    }

    public void entre(Entite e) {
        contenu = e;
    }

    @Override
    public boolean estLibre() {
        return contenu == null;
    }
}
