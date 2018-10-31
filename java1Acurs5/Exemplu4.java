public class Exemplu4 {
    public static void main(String [] args) {
        Angajat a1 = new Angajat("Costel", 4);
        Angajat a2 = new Angajat("Florica", 2);
        
        Angajat a3 = new Angajat("Gigel", 1) {
            @Override
            public int getSalariu() {
                return 4000;
            }
        } ;
        
        /*
         * class AngajatGigel extends Angajat {
         *     @Override
                public int getSalariu() {
                    return 4000;
                } 
           }
           Angajat a3 = new AngajatGigel();
           
         * 
         */
        
        System.out.println(a1.getSalariu());
        System.out.println(a2.getSalariu());
        System.out.println(a3.getSalariu());
    }
}