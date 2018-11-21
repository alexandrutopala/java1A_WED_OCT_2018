import java.util.*;
import java.util.function.*;

public class Exemplu2 {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(4);
        
        list.add(10);
        list.add(5);
        list.add(10);
        
        System.out.println("Size = " + list.size());
        System.out.println("Exista 5? " + list.contains(5));
        System.out.println("Elementul de la indexul 2 este " + list.get(2));
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        System.out.println(new int[]{4, 3});
        System.out.println(list);
        
        list.forEach(e -> System.out.println(e));
        
        // in spatele lui forEach
        Consumer<Integer> c = e -> System.out.println(e);
        for (Integer x : list) {
            c.accept(x);
        }
        
        
        
        
        
        
    }
}