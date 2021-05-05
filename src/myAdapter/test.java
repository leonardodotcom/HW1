
package myAdapter;

/**
 *
 * @author Leonardo
 */
public class test {
    
    public static void main (String[] args) {
        HMap m = new MapAdapter();
        m.put(1, "Uno");
        System.out.println("Presente: " + m.containsValue("Uno"));
        
        HCollection h = m.values();
        System.out.println("Uno presente in h: " + h.contains("Uno"));
        
        m.remove(1);
        System.out.println("Assente: " + m.containsValue("Uno"));
        System.out.println("Assente: " + h.contains("Uno"));
        
        m.put(2, "Due");
        h.remove("Due");
        System.out.println("Assente: " + m.containsValue("Due"));
        System.out.println("Assente: " + h.contains("Due"));
    }

}
