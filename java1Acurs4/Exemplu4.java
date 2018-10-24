public class Exemplu4 {
    public static void main(String [] args) {
        Caine c1 = new Caine();
        Domestic d1 = new Caine();
        Animal a1 = new Caine();
        Animal a2 = new Domestic(false);
        
        //a1.isDeInterior();
        a1.sayHello();
        
        Caine c2 = (Caine) a1; // cast
        
        if (a2 instanceof Caine) {
            Caine c3 = (Caine) a2;
        } else {
            System.out.println("a2 nu poate fi convertit prin polimorfism la Caine");
        }
        
        
        
        
        
        
        
    }
}