public class Exemplu1 {
    public static void main(String [] args) {
        Pisica p1 = new Pisica("Tom");
        Object p2 = new Pisica("Mitzi");
        Object o1 = new int[10];
        Pisica p3 = new Pisica("Mitzi");
        Pisica p4 = p1;
        
        System.out.println(p2.equals(p3)); // true
        System.out.println(p2 == p3); // false
        System.out.println(p1.equals(null)); // false
        System.out.println(p4 == p1); // true
        
        System.out.println("Hash p1 : " + p1.hashCode());
        System.out.println("Hash p2 : " + p2.hashCode());
        System.out.println("Hash p3 : " + p3.hashCode());
        
        System.out.println(p1);
        
        
        
        
        
    }
}