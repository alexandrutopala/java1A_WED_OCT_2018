public class Exemplu1 {
    public static void main(String [] args) {
        int x = 1;
      
        
        
        
        switch (x) {
            case 1 : System.out.println("E luni :(("); break;
            
            case 2 : System.out.println("E marti"); break;
            case 5 : System.out.println("E vineri"); break;
            case 6 : 
            case 7 : System.out.println("E weekend"); break;
            default : System.out.println("invalid");
        }
    }
}