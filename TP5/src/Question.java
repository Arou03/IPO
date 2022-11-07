import java.util.ArrayList;


public class Question {
    private String enonce;
    private ArrayList<Reponse> reponses;
    private Integer givenAnswer;
    private int barem;

    public Question(String enonce) {
        this.enonce = enonce;
        this.reponses = new ArrayList<>();
        this.givenAnswer = null;
        this.barem = 1;
    }

    public Question(String enonce,ArrayList<Reponse> reponses) {
        this.enonce = enonce;
        this.reponses = reponses;
        this.givenAnswer = null;
        this.barem = 1;
    }

    public Question(String enonce,ArrayList<Reponse> reponses, int barem) {
        this.enonce = enonce;
        this.reponses = reponses;
        this.givenAnswer = null;
        this.barem = barem;
    }

    public int getBarem() {
        return barem;
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

    public boolean reponseCorrecte() {
        return reponses.get(this.givenAnswer - 1).isValid();
    }

    @Override
    public String toString() {
        String res = enonce + "\n";
        for (int i = 0; i < reponses.size(); i++) {
            res += "    " + (i + 1) + "- " + reponses.get(i).toString() + "\n";
        }
        return res;
    }

    public int ask() {
        System.out.println(this);
        this.givenAnswer = Utils.enterPositiveInt(this.reponses.size());
        if (reponseCorrecte()) {
            System.out.println("Bonne réponse! C'était bien la réponse " + this.givenAnswer + ".");
            return barem;
        } else {
            System.out.println("C'est dommage, tu feras mieux au prochain coup!");
            return 0;
        }
    }

    public Question copy() {return new Question(this.enonce, this.reponses);}


}
