package myAdapter;

/**
 *
 * @author Leonardo
 */
public interface HMap {
    public int size();
    public boolean isEmpty();
    public boolean containsKey(Object key) throws ClassCastException, NullPointerException;
    public boolean containsValue(Object value) throws ClassCastException, NullPointerException;
    public Object get(Object key) throws ClassCastException, NullPointerException;
    public Object put(Object key, Object value) throws UnsupportedOperationException, ClassCastException, IllegalArgumentException, NullPointerException;
    public Object remove(Object key) throws ClassCastException, NullPointerException, UnsupportedOperationException;
    public void putAll(HMap t) throws UnsupportedOperationException, ClassCastException, IllegalArgumentException, NullPointerException;
    public void clear() throws UnsupportedOperationException;
    public HSet keySet();
    public HCollection values();
    public HSet entrySet();
    @Override
    public boolean equals(Object o);
    @Override
    public int hashCode();
}
