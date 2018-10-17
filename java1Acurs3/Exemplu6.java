public class Exemplu6 {
    public static void main(String [] args) {
        int[][] m1;
        m1 = new int[3][2];
        
        int[][] m2 = new int[][]{{4, 3}, {1, 5}, {6, 2}};
        
        
        System.out.println(m2[1][1]);
        System.out.println(m2[2][1]);
        
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                //System.out.print(m2[i][j] + (j < m2[i].length-1 ? "|" : ""));
                System.out.print(m2[i][j] + " ");
            }
            
            System.out.println();
        }
        
        
        for (int[] x : m2) {
            for (int y : x) {
                System.out.println(y);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}