public class Exemplu1 {
    public static void main(String [] args) {
         Pisica p1 = new Pisica("mitzi", 6);
         Pisica p2 = new Pisica("tom", 3);
         
         System.out.println(p1.counter);
         System.out.println(p2.counter);
         
         System.out.println(Pisica.counter);
         //System.out.println(Pisica.nume);
         
         //static int x;
         p1.m();
         p1.staticM();
         Pisica.staticM();
    }
}