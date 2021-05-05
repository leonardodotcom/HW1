package myAdapter;

import java.util.NoSuchElementException;

/**
 *
 * @author Leonardo
 */
public interface HIterator {
    public boolean hasNext();
    public Object next() throws NoSuchElementException;
    public void remove() throws UnsupportedOperationException, IllegalStateException;
}
