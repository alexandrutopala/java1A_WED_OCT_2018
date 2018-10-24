public class Animal {
    protected String nume; // in mod normal private
    private int greutate;
    
    Animal(String nume, int greutate) {
        this.nume = nume;
        this.greutate = greutate;
    }
    
    Animal() {
        this("Rex", 10);
        System.out.println("c-tor animal");
    }
    
    void sayHello() {
        System.out.println("Buna! Numele meu este " + this.nume);
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        if (nume == null) {
            return;
        }
        this.nume = nume;
    }
    
    public int getGreutate() {
        return greutate;
    }
    
    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
    
    
    
    
    
    
    
    
}