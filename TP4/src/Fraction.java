public class Fraction {
    private int numerateur;
    private int denominateur;

    public Fraction(int num, int denom) {
        this.numerateur = num;
        this.denominateur = denom;
        if(denom < 0) {
            this.denominateur = -this.denominateur;
            this.numerateur = -this.numerateur;
        }
        this.simplify();
    }

    public String toString() {
        if (this.denominateur > 1) {
            return numerateur + " / " + denominateur;
        } else {
            return numerateur + "";
        }
    }

    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    private static int pgcd(int a, int b) {
        if(a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int r = a % b;
        while(r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
    public void simplify() {
        int tmp = pgcd(numerateur, denominateur);
        this.denominateur = this.denominateur / tmp;
        this.numerateur = this.numerateur / tmp;
    }

    public Fraction add(Fraction f) {
        Fraction res = new Fraction(
                (this.numerateur * f.getDenominateur()) + (f.getNumerateur() * this.denominateur),
                this.denominateur * f.getDenominateur()
        );
        res.simplify();
        return res;
    }

    public Fraction mul(Fraction f) {
        Fraction res = new Fraction(
                this.numerateur * f.getNumerateur(),
                this.denominateur * f.getDenominateur()
        );
        res.simplify();
        return res;
    }

    public boolean egal(Fraction f) {
        this.simplify();
        f.simplify();
        return (f.getNumerateur() == this.numerateur) && (this.denominateur == f.getDenominateur());
    }
}
