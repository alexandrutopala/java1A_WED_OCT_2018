public class Exemplu7 {
    public static void main(String [] args) {
        int[] x1, y1; // x1, y1 : []1-dim
        int x2[], y2; // x2 : []1-dim, y2 : int
        
        int[] x3[], y3[][], z3; // x3: 2-dim, y3: 3-dim, z3: 1-dim
        
        
        System.out.println( suma(2, 4, 5) );
        System.out.println( suma(2, 2) );
        System.out.println( suma() );
        System.out.println( suma(new int[]{2, 4, 5}) );
    }
    
    static int suma(int... nr) {
        int[] x = nr;
        int s = 0;
        
        for (int n : nr) {
            s += n;
        }
        
        return s;
        
        
        
        
        
    }
}