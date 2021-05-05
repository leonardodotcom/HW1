package myAdapter;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Objects;

/**
 *
 * @author Leonardo
 */
public class MapAdapter implements HMap {
    private Hashtable ht;
    
    private HCollection values;
    private HSet keys;
    private HSet entries;
    
    public MapAdapter() {
        ht = new Hashtable();
        values = new CollectionBacked(this, ht);
        //keys = (HSet) new ListAdapter();
        //entries = (HSet) new ListAdapter();
    }
    
    public MapAdapter(HMap m) {
        ht = new Hashtable();
        putAll(m);
        
        Enumeration v = ht.elements();
        Enumeration k = ht.keys();
        
        values = new CollectionBacked(this, ht);
        //keys = (HSet) new ListAdapter();
        //entries = (HSet) new ListAdapter();
        
        while (v.hasMoreElements()) {
            Object val = v.nextElement();
            Object key = k.nextElement();
            values.add(val);
            //keys.add(key);
            //entries.add(new Entry(key, val));
        }
        
    }
    
    @Override
    public int size() {
        return ht.size() <= Integer.MAX_VALUE ? ht.size() : Integer.MAX_VALUE;
    }

    @Override
    public boolean isEmpty() {
        return ht.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) throws ClassCastException, NullPointerException {
        if (key == null) throw new NullPointerException();
        return ht.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) throws ClassCastException, NullPointerException {
        if (value == null) throw new NullPointerException();
        return ht.contains(value);
    }

    @Override
    public Object get(Object key) throws ClassCastException, NullPointerException {
        if (key == null) throw new NullPointerException();
        return ht.get(key);
    }

    @Override
    public Object put(Object key, Object value) throws UnsupportedOperationException, ClassCastException, IllegalArgumentException, NullPointerException {
        if (key == null || value == null) throw new NullPointerException();
        
        //keys.add(key);
        values.add(value);
        //entries.add(new Entry(key, value));
        
        return ht.put(key, value);
    }

    @Override
    public Object remove(Object key) throws ClassCastException, NullPointerException, UnsupportedOperationException {
        if (key == null) throw new NullPointerException();
        
        Object val = ht.remove(key);
        
        if (val != null) {
            Entry e = new Entry(key, val);
            //keys.remove(key);
            values.remove(val);
            //entries.remove(e);
        }
        
        return val;
    }

    @Override
    public void putAll(HMap t) throws UnsupportedOperationException, ClassCastException, IllegalArgumentException, NullPointerException {
        if (t == null) throw new NullPointerException();
        
        Object [] keys = keySet().toArray();
        Object [] vals = values().toArray();
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] == null || vals[i] == null) throw new NullPointerException();
            ht.put(keys[i], vals[i]);
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.ht);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o.getClass().equals(HMap.class))) return false;
        return hashCode() == o.hashCode();
    }
    
    @Override
    public void clear() throws UnsupportedOperationException {
        values.clear();
        //entries.clear();
        //keys.clear();

        ht.clear();
    }

    @Override
    public HSet keySet() {
        return keys;
    }

    @Override
    public HCollection values() {
        return values;
    }

    private class Entry {
        private Object key;
        private Object val;
        
        Entry(Object k, Object v) {
            key = k;
            val = v;
        }
        
        Object getKey() { return key; }
        Object getVal() { return val; }
    }
    
    @Override
    public HSet entrySet() {
        return entries;
    }  
}