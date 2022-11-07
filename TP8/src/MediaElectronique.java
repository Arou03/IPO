public class MediaElectronique extends Media{
    private int duree;

    public MediaElectronique(String titre, String auteur, int duree) {
        super(titre, auteur);
        this.duree = duree;
    }
}
