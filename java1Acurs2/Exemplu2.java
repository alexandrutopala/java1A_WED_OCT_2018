public class Exemplu2 {
    public static void main(String [] args) {
        int n = 0;
        
        
        
        
        while (n <= 10) {
            n++;
            
            if (n == 5) {
                continue;
            }
            
            if (n == 9) {
                break;
            }
            
            
            
            System.out.println(n);
        }
    }
}