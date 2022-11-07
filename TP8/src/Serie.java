import java.util.ArrayList;

public class Serie extends Media{
    private ArrayList<Media> medias;

    public Serie(String titre, String auteur, ArrayList<Media> medias) {
        super(titre, auteur);
        this.medias = medias;
    }

    public void addMedia(Media m) {
        this.medias.add(m);
    }

    public float moyenneAgregee() {
        float res = 0;
        res += this.moyenneNotes();
        for (Media m : this.medias) {
            float tmp = m.moyenneNotes();
            res += tmp;
        }
        return res / (this.medias.size() + 1);
    }
}
