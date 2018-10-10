public class Exemplu5 {
    public static void main(String [] args) {
        Pisica p1;
        p1 = new Pisica();
        
        p1.nume = "Mitzi";
        
        p1.varsta = 4;
        p1.culoare = "negru";
        
        Pisica p2;
        p2 = null;//new Pisica();
        //p2.nume = "Tom";
        
        System.out.println(p1.nume);
        
        Pisica p3 = new Pisica();
        p3.nume = "Caine";
        p3.varsta = p1.varsta;
        p3.culoare = p1.culoare;
        
        System.out.println(p3.nume);
        System.out.println(p3.varsta);
        System.out.println(p3.culoare);
        
        p3.sayMiau();
        
        
        
    }
}