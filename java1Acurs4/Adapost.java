public class Adapost {
    private Animal[] animale;
    private int counter;
    
    public Adapost(int n) {
        animale = new Animal[n];
    }
    
    public int getCounter() {
        return counter;
    }
    
    public Animal[] getAnimale() {
        return animale;
    }
    
    public void adauga(Animal a) {
        if (counter == animale.length) {
            return;
        }
        
        animale[counter] = a;
        counter++;
    }
    
    public void afiseaza() {
        for (int i = 0; i < counter; i++) {
            Animal a = animale[i];
            System.out.println(a.getNume() + " " + a.getGreutate());
        }
    }
    
    public void sayHam() {
        for (int i = 0; i < counter; i++) {
            if (animale[i] instanceof Caine) {
                animale[i].sayHello();
            }
        }
    }
    
    
    
    
    
    
}