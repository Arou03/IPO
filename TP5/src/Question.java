import java.util.ArrayList;


public class Question {
    private String enonce;
    private ArrayList<Reponse> reponses;

    public Question(String enonce) {
        this.enonce = enonce;
        this.reponses = new ArrayList<>();
    }

    public String getEnonce() {
        return enonce;
    }

    public ArrayList<Reponse> getReponses() {
        return reponses;
    }

    public void add(String txt, boolean val) {
        this.reponses.add(new Reponse(txt, val));
    }

    public boolean isValid() {
        for (Reponse r: reponses) {
            if(r.isValid()) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String res = enonce + "\n";
        for (int i = 0; i < reponses.size(); i++) {
            res += "    " + (i + 1) + "- " + reponses.get(i).toString() + "\n";
        }
        return res;
    }
}
