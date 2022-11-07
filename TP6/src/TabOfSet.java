public class TabOfSet implements Set {

    private Integer[] tab;
    private int size;

    public TabOfSet(int size) {
        this.tab = new Integer[size];
        this.size = 0;
    }

    @Override
    public boolean contains(Integer e) {
        for (int i = 0; i < this.size; i++) {
            if (e == tab[i]) return true;
        }
        return false;
    }

    @Override
    public int cardinal() {
        return size;
    }

    @Override
    public void add(Integer e) {
        if(!this.contains(e)) {
            this.tab[size] = e;
            size++;
        }
    }

    @Override
    public void remove(Integer e) {
        if(!this.contains(e)) {
            int tmp = -1;
            for (int i = 0; i < this.size; i++) {
                if(this.tab[i] == e) {
                    tmp = i;
                    this.tab[i] = null;
                }
            }
            this.size = -1;
            for (int i = tmp; i < size; i++) {
                this.tab[i] = this.tab[i + 1];
                this.tab[i + 1] = null;
            }
        }
    }

    @Override
    public Set clone() {
        return this;
    }

    @Override
    public Set union(Set s) {
        return null;
    }

    @Override
    public Set intersection(Set s) {
        return null;
    }

    public boolean test() {
        return false;
    }
}
