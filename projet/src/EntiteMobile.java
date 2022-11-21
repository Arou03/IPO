abstract class EntiteMobile extends Entite{
    protected Direction direction;
    protected int ligne;
    protected int colonne;

    public EntiteMobile(Direction d) {
        this.direction = d;
    }

    public abstract String toString(String background);

    public int action(Case courante, Case cible) {
        if(this instanceof Personnage && courante instanceof Sortie) {
            return -1;
        } else if (cible instanceof CaseTraversable) {
            if (cible.estLibre()) {
                ((CaseTraversable) courante).vide();
                ((CaseTraversable) cible).entre(this);
            } else{
                if(((CaseTraversable) cible).contenu instanceof Obstacle) {
                    ((CaseTraversable) cible).contenu.damage();
                } else if((((CaseTraversable) cible).contenu instanceof Personnage) &&
                                                        (this instanceof Monstre))
                {
                    ((CaseTraversable) cible).contenu.damage();
                }
            }
        } else {
            this.direction = Direction.random();
        }
        return 0;
    }
}
