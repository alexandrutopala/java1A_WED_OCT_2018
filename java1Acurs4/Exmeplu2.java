public class Exmeplu2 {
    public static void main(String [] args) {
        Adapost adapost = new Adapost(5);
        
        adapost.adauga( new Animal("Azor", 6) );
        adapost.adauga( new Animal("Caine", 2) );
        
        adapost.afiseaza();
        
        Animal[] aux = adapost.getAnimale();
        aux[0] = new Animal("Tom", 0);
        
        adapost.afiseaza();
        
        Domestic d = new Domestic(true);
        d.setNume("Croco");
        d.sayHello();
        
        
        
        
    }
}