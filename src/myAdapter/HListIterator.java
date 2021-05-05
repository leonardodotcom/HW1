package myAdapter;

import java.util.NoSuchElementException;

/**
 *
 * @author Leonardo
 */
public interface HListIterator extends HIterator {
    public boolean hasPrevious();
    public Object previous() throws NoSuchElementException;
    public int nextIndex();
    public int previousIndex();
    public void set(Object o) throws UnsupportedOperationException, ClassCastException, IllegalArgumentException, IllegalStateException;
    public void add(Object o) throws UnsupportedOperationException, ClassCastException, IllegalArgumentException;
            
}
