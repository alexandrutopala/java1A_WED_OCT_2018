public class Exemplu2 {
    public static void main(String [] args) {
        String rez = transform("ana are mere");
        System.out.println(rez);
    }
    
    private static String transform(String s) {
        // initial: "ana are mere"
        
        // pas 1 : "ana99are99mere"
        s = s.replace(" ", "99");
        System.out.println(s);
        
        // pas 2 : "erem99era99ana"
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        
        s = sb.toString();
        
        return s;
    }
}