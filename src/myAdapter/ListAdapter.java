package myAdapter;

import java.util.Vector;

/**
 *
 * @author Leonardo
 */
public class ListAdapter implements HList, HCollection {
    
    private Vector v;
    
    public ListAdapter() {
        v = new Vector();
    }
    
    public ListAdapter(HList l) {
        v = new Vector();
        addAll(l);
    }
    
    @Override
    public HList subList(int fromIndex, int toIndex) throws IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HListIterator listIterator(int index) throws IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HListIterator listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) throws ClassCastException, NullPointerException {
        return v.lastIndexOf(o);
    }

    @Override
    public int indexOf(Object o) throws ClassCastException, NullPointerException {
        return v.indexOf(o);
    }

    @Override
    public Object remove(int index) throws UnsupportedOperationException, IndexOutOfBoundsException {
        if (index < 0 || index > v.size()) throw new IndexOutOfBoundsException();
        Object r = get(index);
        v.remove(index);
        return r;
        
    }

    @Override
    public void add(int index, Object element) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException, IndexOutOfBoundsException {
        if (index < 0 || index > v.size()) throw new IndexOutOfBoundsException();
        v.insertElementAt(element, index);
    }

    @Override
    public Object set(int index, Object element) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException, IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > v.size()) throw new IndexOutOfBoundsException();
        return v.elementAt(index);
    }

    @Override
    public boolean addAll(int index, HCollection c) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException, IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return v.size() <= Integer.MAX_VALUE ? v.size() : Integer.MAX_VALUE;
    }

    @Override
    public boolean isEmpty() {
        return v.isEmpty();
    }

    @Override
    public boolean contains(Object o) throws ClassCastException, NullPointerException {
        return v.contains(o);
    }

    @Override
    public HIterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] a) throws ArrayStoreException, NullPointerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Object o) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException {
        v.addElement(o);
        return true;
    }

    @Override
    public boolean remove(Object o) throws ClassCastException, NullPointerException, UnsupportedOperationException {
        if (contains(o)) {
            v.remove(o);
            return true;
        } return false;
    }

    @Override
    public boolean containsAll(HCollection c) throws ClassCastException, NullPointerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(HCollection c) throws UnsupportedOperationException, ClassCastException, NullPointerException, IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(HCollection c) throws UnsupportedOperationException, ClassCastException, NullPointerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(HCollection c) throws UnsupportedOperationException, ClassCastException, NullPointerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() throws UnsupportedOperationException {
        v.removeAllElements();
    }
    
}//EQUALS in HCOLLECTION DOMANDA

/* HASHCODE

  hashCode = 1;
  Iterator i = list.iterator();
  while (i.hasNext()) {
      Object obj = i.next();
      hashCode = 31*hashCode + (obj==null ? 0 : obj.hashCode());
  }


*/