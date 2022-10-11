public class Tab {
    private int len;
    private int begin;
    private String[] tab;

    public Tab(int begin, int end) {
        this.len = Math.abs(end - begin);
        this.begin = begin;
        this.tab = new String[len];
    }

    public int length() {
        return len;
    }

    public String get(int i) {
        return tab[i + begin];
    }

    public void set(int i, String s) {
        this.tab[i + begin] = s;
    }
}
