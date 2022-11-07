import java.util.ArrayList;

public class QCM {
    private ArrayList<Question> qcm;

    public QCM(ArrayList<Question> qcm) {
        this.qcm = qcm;
    }

    public QCM() {
        this.qcm = new ArrayList<>();
    }

    public ArrayList<Question> getQcm() {
        return qcm;
    }

    public void add(Question question) {
        qcm.add(question);
    }

    public boolean isValid() {
        for (Question q : this.qcm) {
            if(!q.isValid()) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String res = "";
        for (Question q: qcm) {
            res += q.toString();
        }
        return res;
    }

    public void jouer() {
        int score = 0;
        int scoretot = 0;
        for (Question q : qcm) {
            score += q.ask();
            scoretot+= q.getBarem();
        }

        System.out.println("Bravo! Vous avez un score de " + score + "/" + scoretot + ".");
    }

    public QCM copy() {
        QCM res = new QCM();
        for (Question q : qcm) {
            res.add(q.copy());
        }
        return res;
    }
}
