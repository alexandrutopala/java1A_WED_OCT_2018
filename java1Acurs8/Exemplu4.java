import java.util.*;

public class Exemplu4 {
    public static void main(String [] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(4);
        
        
        list.addFirst(10);
        list.addLast(2);
        list.removeFirst();
        list.addFirst(11);
        list.addLast(9);
        list.removeLast();
        list.removeFirst();
        list.addFirst(1);
        
        System.out.println(list); // 1 4 2 
        
        
        
        
    }
}