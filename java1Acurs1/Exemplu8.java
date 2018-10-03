public class Exemplu8 {
    public static void main(String [] args) {
        boolean b = true;
        
        if (b == true) {
            
            System.out.println("b este true");
        } else 
            System.out.println("b este false");
        System.out.println("in afara else-ului");
        
        int x = b == true ? 4 : -3;
        System.out.println(x);
        
        System.out.println("end");
        
        
        
        
    }
}