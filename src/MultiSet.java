public interface MultiSet {
    public <T>  boolean add(T item);

    public <T> void remove(T item);

    public <T>  boolean contains(T item);

    public boolean is_empty();

    public <T>  int count(T item);

    public <T> int size();

}
