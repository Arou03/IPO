public class Video extends MediaElectronique{
    private String[] sousTitres;

    public Video(String titre, String auteur, int duree, String[] sousTitres) {
        super(titre, auteur, duree);
        this.sousTitres = sousTitres;
    }
}
