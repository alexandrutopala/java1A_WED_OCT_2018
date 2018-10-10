public class Exmeplu6 {
    public static void main(String [] args) {
        Foo f1 = new Foo();
        
        int s = f1.suma(1, 2);
        long s1 = f1.suma(2, 6);
        
        short s2 = (short) f1.suma(3, 6);
        
        System.out.println(s);
        
        f1.m(3);
        f1.m(5L);
        //f1.m(null);
    }
}