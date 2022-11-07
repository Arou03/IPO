import java.util.ArrayList;

public class Media {
    private String titre;
    private String auteur;
    private ArrayList<Float> notes;

    public Media(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        notes =new ArrayList<Float>(0);
    }

    @Override
    public String toString() {
        return "\"" + this.titre + "\" par " + this.auteur;
    }

    public void vote(float note) throws Exception {
        if (note >= 0 || note <= 5) {
            notes.add(note);
        } else {
            throw new Exception("Note invalide");
        }
    }

    public float moyenneNotes() {
        float res = 0;
        for (float note : this.notes) {
            res += note;
        }
        if (this.notes.size() > 0) return res / (float) this.notes.size();
        return 0;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }
}
