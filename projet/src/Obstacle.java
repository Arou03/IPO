public class Obstacle extends Entite{

    public Obstacle() {
        super();
    }

    @Override
    public String toString(String background) {
        String res = "";
        switch (resistance) {
            case 3 : return "@@@";
            case 2 : return background.charAt(0) + "@@";
            case 1 : return background.charAt(0) + "@" + background.charAt(2);
            default :
                return background;
        }
    }
}
