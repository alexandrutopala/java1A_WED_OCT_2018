public class Masina {
    String marca;
    // singleton nesincronizat lazy
    private static Masina singleton; // va retine unica instanta de Masina din program
    
    private Masina() {
    }
    
    
    public static Masina getInstance() {
        if (singleton == null) {
            singleton = new Masina();
            System.out.println("instanta creata");
        }
        return singleton;
    }
}