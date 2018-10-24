public class Domestic extends Animal {
    protected boolean deInterior; // 1 - adaugare de atribute
    
    public Domestic(boolean deInterior) {
        this.deInterior = deInterior;
        System.out.println("c-tor domestic");
    }
    
    public void setDeInterior(boolean deInterior) { // 2 - adaugare de comportamente
        this.deInterior = deInterior;
    }
    
    public boolean isDeInterior() {
        return deInterior;
    }
}