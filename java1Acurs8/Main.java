import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String [] input;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            line = scanner.nextLine();
            input = line.split("\\s+");
            
            switch (input[0].toUpperCase()) {
                
                case "ADD" :
                    int x = Integer.parseInt(input[1]);
                    list.add(x);
                    break;
                case "REMOVE" :
                    int index = Integer.parseInt(input[1]);
                    list.remove(index);
                    break;
                case "AFIS_ORDERED" : 
                    
                    System.out.println(list);
                    break;
                case "AFIS_SORTED" : 
                    ArrayList<Integer> copie = new ArrayList<>(list);
                    Collections.sort(copie);
                    System.out.println(copie);
                    break;
                case "REMOVE_ALL" : 
                    Integer i = Integer.parseInt(input[1]);
                    /*
                    while (list.contains(i)) {
                        list.remove(i);
                    }
                    */
                    list.removeIf(e -> e == i);
                    
                    break;
                case "CLEAR" :
                    list.clear();
                    break;
                case "EXIT" : 
                    System.exit(0);
                    break;
                default : System.err.println("Comanda invalida");
            }
            
            
            
            
            
            
            
            
            
            
            
        }
    }
}