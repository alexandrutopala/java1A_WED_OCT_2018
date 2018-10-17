public class Exemplu4 {
    public static void main(String [] args) {
        int[] v = {4, 6, 3, 3, -1};
        
        v[1] = 7;
        System.out.println(++v[1]); // 8
        
        
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
        
        for (int x : v) {
            System.out.println(x);
        }
        
    }
}