public class Exemplu6 {
    public static void main(String [] args) {
        Masina m1 = Masina.getInstance();
        m1.marca = "Dacia";
        System.out.println(m1.marca);
        
        
        Masina m2 = Masina.getInstance();
        m2.marca = "BMW";
        
        System.out.println(m1.marca); // BMW 
        
        
    }
}