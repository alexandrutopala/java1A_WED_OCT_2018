public class Pisica /*IMPLICIT: extends Object */ {
    public String nume;
    public int varsta;
    
    public Pisica(String nume) {
        this.nume = nume;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        
        if (!(obj instanceof Pisica)) {
            return false;
        }
        
        Pisica p = (Pisica) obj;
        
        return this.nume.equals(p.nume);
    }
    
    @Override
    public int hashCode() {
        return this.nume.hashCode();
    }
    
    @Override
    public String toString() { // definim cum arata instanta this sub forma de String
        return "Miau! " + this.nume;
    }
    
    
    
    
    
    
    
    
    
    
}