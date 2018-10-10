public class Pisica {
    String nume;
    int varsta;
    String culoare;
    
    
    
    Pisica() {
        this("mitzi", 1, "alb");
        System.out.println("S-a creat o pisica");
    }
    
    Pisica(String nume, int varsta, String culoare) {
        this.nume = nume;
        this.varsta = varsta; 
        this.culoare = culoare;
        System.out.println("c-tor supraincarcat");
    }
    
    
    
    void sayMiau() {
        System.out.println("miau! numele meu este " + this.nume );
        return;
    }
}