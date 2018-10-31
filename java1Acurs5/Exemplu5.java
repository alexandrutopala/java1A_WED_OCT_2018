public class Exemplu5 {
    public static void main(String [] args) {
        Operatie o1 = new Operatie() {
            @Override
            public int compute(int a, int b) {
                return a + b;
            }
        };
        
        System.out.println(o1.compute(2, 2));
        
        Operatie o2 = (a, b) -> a + b;
        System.out.println(o2.compute(2, 4));
        
        Operatie o3 = (int a, int b) -> a + b;
        
        Operatie o4 = (a, b) -> {
            return a + b;
        };
        
        
        
        
        
        
        
        
        
    }
}