public class Exemplu2 {
    public static void main(String [] args) {
        Anotimp a;
        a = Anotimp.VARA;
        
        switch (a) {
            
            case IARNA : System.out.println("E foarte frig"); break;
            case PRIMAVARA : System.out.println("E caldut"); break;
            case VARA : System.out.println("E cald"); break;
            case TOAMNA : System.out.println("E frigut"); break;
        }
        
        for (Anotimp a1 : Anotimp.values()) {
            System.out.println(a1.ordinal() + " : " + a1.name());
        }
        
        Anotimp a2 = Anotimp.valueOf("VARA");
        System.out.println(a2);
        a2.m();
        
        
        
        
        
        
        
        
        
    }
}