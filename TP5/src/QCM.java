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
}
