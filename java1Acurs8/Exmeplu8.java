import java.util.*;

public class Exmeplu8 {
    public static void main(String [] args) {
        Comparator<Angajat> comp = new Comparator<Angajat>() {
            public int compare(Angajat a1, Angajat a2) {
                return a1.nume.compareTo(a2.nume);
            }
        };
        
        Set<Angajat> angajati = new TreeSet<>(comp);
        
        angajati.add(new Angajat("Gigel", 24));
        
        angajati.add(new Angajat("Maria", 21));        
        angajati.add(new Angajat("Costel", 28));
        angajati.add(new Angajat("Florica", 24));
        
        System.out.println(angajati);
    }
}