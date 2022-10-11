public class Chrono {
    private int heures, minutes, secondes;

    public Chrono(int secondes) {
        this.heures = 0;
        this.minutes = 0;
        this.secondes = Math.abs(secondes);
        this.normalise();
    }

    public Chrono(int heures, int minutes, int secondes) {
        this.heures = Math.abs(heures);
        this.minutes = Math.abs(minutes);
        this.secondes = Math.abs(secondes);
        this.normalise();
    }

    public String toString() {
        return "h : " + this.heures + ", m : " + this.minutes + ", s : " + this.secondes;
    }

    public int toSeconds() {
        return this.heures * 60 * 60
                + this.minutes * 60
                + this.secondes;
    }

    public void normalise() {
        while(this.secondes >= 60) {
            this.minutes++;
            this.secondes -= 60;
        }
        while(this.minutes >= 60) {
            this.heures++;
            this.minutes -= 60;
        }
    }

    public int getHeures() { return this.heures; }
    public int getMinutes() { return this.minutes; }
    public int getSecondes() { return this.secondes; }

    public boolean equals(Object o) {
        if(o instanceof Chrono) {
            return (this.secondes == ((Chrono) o).secondes) &&
                    (this.minutes == ((Chrono) o).minutes) &&
                    (this.heures == ((Chrono) o).heures);
        }
        return false;
    }

    public boolean avant(Chrono c) {
        if(this.heures < c.getHeures()) {
            return true;
        } else if(this.heures > c.getHeures()) {
            return false;
        } else if(this.minutes < c.getMinutes()) {
            return true;
        } else if(this.minutes > c.getMinutes()) {
            return false;
        } else if(this.secondes < c.getSecondes()) {
            return true;
        } else if(this.secondes > c.getSecondes()) {
            return false;
        } else {
            return false;
        }
    }

    public void avance(int n) {
        this.secondes += n;
        this.normalise();
    }

    public Chrono diff(Chrono c) {
        int tmp;
        if(this.avant(c)) {
            tmp = this.toSeconds() - c.toSeconds();
        } else {
            tmp = c.toSeconds() - this.toSeconds();
        }
        return new Chrono(tmp);
    }
}