public class Livre extends Media{
    private int nbPage;

    public Livre(String titre, String auteur, int nbPage) {
        super(titre, auteur);
        this.nbPage = nbPage;
    }
}
