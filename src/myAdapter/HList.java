package myAdapter;

/**
 *
 * @author Leonardo
 */
public interface HList extends HCollection {
    public HList subList(int fromIndex, int toIndex) throws IndexOutOfBoundsException;
    public HListIterator listIterator(int index) throws IndexOutOfBoundsException;
    public HListIterator listIterator();
    public int lastIndexOf(Object o) throws ClassCastException, NullPointerException;
    public int indexOf(Object o) throws ClassCastException, NullPointerException;
    public Object remove(int index) throws UnsupportedOperationException, IndexOutOfBoundsException;
    public void add(int index, Object element) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException, IndexOutOfBoundsException;
    public Object set(int index, Object element) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException, IndexOutOfBoundsException;
    public Object get(int index) throws IndexOutOfBoundsException;
    public boolean addAll(int index, HCollection c) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException, IndexOutOfBoundsException;
}
