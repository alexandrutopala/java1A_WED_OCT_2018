import java.util.*;

public class Exemplu5 {
    public static void main(String [] args) {
        Set<String> set = new HashSet<>();
        
        set.add("Timisoara");
        
        set.add("Cluj-Napoca");
        set.add("Bucuresti");
        set.add("Timisoara");
        set.add("Brasov");
        
        System.out.println(set);
    }
}