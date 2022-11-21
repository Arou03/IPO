public class Monstre  extends EntiteMobile{
    public Monstre(Direction d) {
        super(d);
    }

    @Override
    public String toString(String background) {
        String res = "" + background.charAt(0);
        switch (this.direction) {
            case est -> {
                res += "»";
                break;
            }
            case ouest -> {
                res += "«";
                break;
            }
            case nord -> {
                res += "m";
                break;
            }
            case sud -> {
                res += "w";
                break;
            }
        }
        return res + background.charAt(2);
    }
}
