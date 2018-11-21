import java.util.*;

public class Exemplu6 {
    public static void main(String [] args) {
        Set<String> set = new LinkedHashSet<>();
        
        set.add("Timisoara");
        
        set.add("Cluj-Napoca");
        set.add("Bucuresti");
        set.add("Timisoara");
        set.add("Brasov");
        
        System.out.println(set);
    }
}