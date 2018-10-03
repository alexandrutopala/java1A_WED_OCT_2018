public class Exemplu9 {
    public static void main(String [] args) {
        int a = 5;
        int b = 5;
        int c = 2;
        
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}