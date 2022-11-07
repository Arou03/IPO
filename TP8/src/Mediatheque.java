import java.util.ArrayList;

public class Mediatheque {
    private ArrayList<Media> medias;

    public Mediatheque() {
        this.medias = new ArrayList<Media>(0);
    }

    public void add(Media m) {
        medias.add(m);
    }

    public ArrayList<Media> searchByTitle(String titre) {
        ArrayList res = new ArrayList<>(0);
        for (Media m : medias) {
            if(titre.compareToIgnoreCase(m.getTitre()) == 0) res.add(m);
        }
        return res;
    }

    public ArrayList<Media> searchByAuthor(String auteur) {
        ArrayList res = new ArrayList<>(0);
        for (Media m : medias) {
            if(auteur.compareToIgnoreCase(m.getAuteur()) == 0) res.add(m);
        }
        return res;
    }

    public ArrayList<Media> searchByType(String type) throws Exception {
        ArrayList res = new ArrayList<>(0);
        switch (type) {
            case "livre" :
                for (Media m : medias) {
                    if(m instanceof Livre) res.add(m);
                }
                return res;
            case "audio" :
                for (Media m : medias) {
                    if(m instanceof Audio) res.add(m);
                }
                return res;
            case "video" :
                for (Media m : medias) {
                    if(m instanceof Video) res.add(m);
                }
                return res;
            case "serie" :
                for (Media m : medias) {
                    if(m instanceof Serie) res.add(m);
                }
                return res;
            default:
                throw new Exception("Valeur invalide");
        }
    }

    public ArrayList<Media> filtre(String critere, String valeur) throws Exception {
        switch (critere) {
            case "auteur" : return searchByAuthor(valeur);
            case "titre" : return searchByTitle(valeur);
            case "media" : return searchByType(valeur);
            default:
                throw new Exception("Critere invalide");
        }
    }
}
