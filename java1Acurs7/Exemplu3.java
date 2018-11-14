public class Exemplu3 {
    public static void main(String [] args) {
        int x = 5;
        
        Integer i1 = new Integer(x);
        Integer i2 = new Integer(3);
        
        
        Integer i3 = i1 + i2;
        System.out.println(i3);
        System.out.println(i1 > i2);
        
        Object o1 = i3;
        System.out.println(o1);
        
        int y = i1.intValue();
        System.out.println(y);
        
        
        
        
        
        
        
    }
}