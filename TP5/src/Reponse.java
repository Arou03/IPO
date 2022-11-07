import java.util.ArrayList;

public class Reponse {
    private String txt;
    private boolean valid;

    public Reponse(String txt, boolean valid) {
        this.txt = txt;
        this.valid = valid;
    }

    public String getTxt() {
        return txt;
    }

    public boolean isValid() {
        return valid;
    }

    @Override
    public String toString() {
        return txt;
    }
}
