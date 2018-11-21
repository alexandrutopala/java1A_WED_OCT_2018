import java.util.*;

public class Exmeplu7 {
    public static void main(String [] args) {
        Set<Integer> set = new TreeSet<>();
        
        set.add(5);
        
        set.add(1);
        set.add(3);
        set.add(1);
        
        System.out.println(set);
        
        set.add(-1);
        
        System.out.println(set);
        
    }
}