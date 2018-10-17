public class Exemplu5 {
    public static void main(String [] args) {
        int[] v1;
        v1 = new int[]{4, 3, 2};
        
        for (int i = 0; i < v1.length; i++) {
            System.out.println(v1[i]);
        }
        
        int[] v2 = new int[2];
        
        for (int x : v2) {
            System.out.println(x);
        }
    }
}