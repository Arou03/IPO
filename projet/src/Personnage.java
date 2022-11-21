public class Personnage extends EntiteMobile{
    public Personnage(Direction d) {
        super(d);
    }
    @Override
    public String toString(String background) {
        String res = "" + background.charAt(0);
        switch (this.direction) {
            case est -> {
                res += ">";
                break;
            }
            case ouest -> {
                res += "<";
                break;
            }
            case nord -> {
                res += "^";
                break;
            }
            case sud -> {
                res += "v";
                break;
            }
        }
        return res + background.charAt(2);
    }
}
