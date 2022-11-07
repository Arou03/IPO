public class Audio extends MediaElectronique{
    private String type;

    public Audio(String titre, String auteur, String type, int duree) {
        super(titre, auteur, duree);
        this.type = type;
    }
}
