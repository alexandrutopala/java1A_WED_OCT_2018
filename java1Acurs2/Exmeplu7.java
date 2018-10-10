public class Exmeplu7 {
    public static void main(String [] args) {
        int x = 6;
        
        Pisica p = new Pisica();
        p.nume = "Tom";
        
        Bar b = new Bar();
        
        b.transferCopie(x);
        b.transferReferinta(p);
        
        System.out.println(x); // 6 7 7
        System.out.println(p.nume); // Tommy Tom Tommy
    }
}