import java.util.*;

public class Cafenea {
    private static Cafenea singleton;
    private Map<String, Bautura> bauturi = new HashMap<>();
    
    private Cafenea() {
    }
    
    public static Cafenea getInstance() {
        if (singleton == null) {
            singleton = new Cafenea();
        }
        return singleton;
    }
    
    public void adaugaBautura(Bautura b) throws NameAlreadyExistsException {
        if (bauturi.containsKey(b.nume)) {
            throw new NameAlreadyExistsException();
        }
        bauturi.put(b.nume, b);
    }
    
    public void afiseaza() {
        for (String key : bauturi.keySet()) {
            Bautura value = bauturi.get(key);
            System.out.println(value);
        }
    }
    
    public void afiseazaCafele() {
        for (String key : bauturi.keySet()) {
            Bautura value = bauturi.get(key);
            if (value instanceof Cafea) {
                System.out.println(value);
            }
        }
    }
    
    public void stergeBautura(String nume) {
        bauturi.remove(nume);
        
        /*
        daca nu foloseam map
        Bautura aux = null;
        
        for (Bautura b : setBautura) {
            if (b.nume.equals(nume)) {
                aux = b;
                break;
            }
        }
         
        setBauturi.remove(aux);
        
         */
    }
    
    public void afiseazaSortat() {
        
        Comparator<Bautura> comp = (b1, b2) -> b1.pret - b2.pret;
        /*
          
        sau, implementarea comparatorului cu o clasa anonima
         
        Comparator<Bautura> comp = new Comparator<Bautura>() {
            @Override
            public int compare(Bautura b1, Bautura b2) {
                return b1.pret - b2.pret;
            }
        };
         
         */
        
        
        /*
        Set<Bautura> copie = new TreeSet<>(comp);
        copie.addAll(bauturi.values());
        copie.forEach(System.out::println); // e -> System.out.println(e)
        
        */
         
        List<Bautura> copie = new ArrayList<>(); 
        for (String key : bauturi.keySet()) {
            copie.add(bauturi.get(key));
        }
        
        Collections.sort(copie, comp);
        copie.forEach(System.out::println); // e -> System.out.println(e)
        
    }
    
    
    
    
    
    
}