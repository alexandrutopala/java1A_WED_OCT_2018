import java.util.*;

public class Exemplu9 {
    public static void main(String [] args) {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("Monica", 1);
        
        map.put("Gigel", 1);
        map.put("Costel", 3);
        
        System.out.println(map);
        
        map.put("Gigel", 10);
        
        System.out.println(map);
        
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }
        
        
        
    }
}




