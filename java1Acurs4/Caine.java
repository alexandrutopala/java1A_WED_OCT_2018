public class Caine extends Domestic {
    public String nume; // 3 - hiding fields
    
    public Caine() {
        super(true);
        System.out.println("c-tor caine");
    }
    
    public void thisNume() {
        // this.nume - cel din clasa Caine
        System.out.println("this " + this.nume);
    }
    
    public void superNume() {
        // super.nume - cel din clasa Animal
        System.out.println("super : " + super.nume);
    }
    
    @Override
    public void sayHello() { // 4 - suprascriere
        System.out.println("Ham! Numele meu este " + nume);
    }
    
    
    
    
    
}