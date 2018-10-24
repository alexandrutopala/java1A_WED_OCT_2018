public class Exemplu1 {
    public static void main(String [] args) {
        Animal a1 = new Animal("Max", 4);
        Animal a2 = new Animal();
        
        //a1.nume = null; // instanta malefica
        
        System.out.println(a1.getNume());
    }
}