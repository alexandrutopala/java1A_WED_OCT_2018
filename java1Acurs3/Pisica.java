public class Pisica {
    String nume = "Tom";
    int varsta;
    final int x;// = 5;
    static int counter;
    
    { // bloc anonim non-static
        
        /* La creerea de instanta : 
         *  - se atribuie valorile implicite atributelor
         *  - se executa blocurile anonime non-statice
         *  - se executa constructorul
         */
        System.out.println("bloc anonim non-static");
        //x = 5;
    }
    
    static {
        /*
         * La incarcarea clasei in memorie (la prima folosire a ei in program) :
         *  - se aloca spatiu in memorie pentru variabilele statice si sunt atribuite valorile implicite
         *  - se executa blocurile anonime static
         */
        System.out.println("blocul anonim static");
    }
    
    void m() {
        System.out.println(nume);
        System.out.println(this.counter);
        System.out.println("non-static");
    }
    
    
    static void staticM() {
        System.out.println(counter);
        //System.out.println(this.nume); // nu exista instanta care se comporta
        System.out.println("static");
    }
    
    Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        counter++;
        System.out.println("c-tor");
        x = 5;
    }
    
    
    
    
    
    
    
    
    
    
}