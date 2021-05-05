package myAdapter;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author Leonardo
 */
public class CollectionBacked implements HCollection {
    private Vector val;
    private Hashtable h;
    
    public CollectionBacked(HMap m, Hashtable h) {
        this.h = h;
        val = new Vector();
        Enumeration e = h.elements();
        
        while (e.hasMoreElements())
            val.add(e.nextElement());
        
    }
    
    @Override
    public int size() {
        return val.size() <= Integer.MAX_VALUE ? val.size() : Integer.MAX_VALUE;
    }

    @Override
    public boolean isEmpty() {
        return val.isEmpty();
    }

    @Override
    public boolean contains(Object o) throws ClassCastException, NullPointerException {
        return val.contains(o);
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
        return val.add(o);
    }

    @Override
    public boolean remove(Object o) throws ClassCastException, NullPointerException, UnsupportedOperationException {
        //Trovare chiave da valore
        Enumeration k = h.keys();
        
        Object key = null;
        boolean stop = false;
        while(k.hasMoreElements() && !stop) {
            key = k.nextElement();
            if (h.get(key).equals(o)) {
                h.remove(key);
                stop = true;
            }
        }
        
        return val.remove(o);
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
        val.clear();
        h.clear();
    }
    
}
