package myAdapter;

/**
 *
 * @author Leonardo
 */
public interface HCollection {
    public int size();
    public boolean isEmpty();
    public boolean contains(Object o) throws ClassCastException, NullPointerException;
    public HIterator iterator();
    public Object[] toArray();
    public Object[] toArray(Object[] a) throws ArrayStoreException, NullPointerException;
    public boolean add(Object o) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException;
    public boolean remove(Object o) throws ClassCastException, NullPointerException, UnsupportedOperationException;
    public boolean containsAll(HCollection c) throws ClassCastException, NullPointerException;
    public boolean addAll(HCollection c) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException;
    public boolean removeAll(HCollection c) throws UnsupportedOperationException, ClassCastException, NullPointerException;
    public boolean retainAll(HCollection c) throws UnsupportedOperationException, ClassCastException, NullPointerException;
    public void clear() throws UnsupportedOperationException;
    @Override
    public boolean equals(Object o);
    @Override
    public int hashCode();
}
