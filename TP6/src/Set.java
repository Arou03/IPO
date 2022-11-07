public interface Set {
    public boolean contains(Integer e);
    public int cardinal();
    public String toString();
    public void add(Integer e);
    public void remove(Integer e);
    public Set clone();
    public Set union(Set s);
    public Set intersection(Set s);
}
