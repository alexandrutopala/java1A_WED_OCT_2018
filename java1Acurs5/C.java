public class C {
    int x = 4;
    
    void m() {
        abstract class AbstractLocalC {
        }
        
        //interface I { // nu putem avea interfete locale
        //}
        
        //enum E { nu putem avea enumerari locale
            
        //}
        final int z = 5;
        //z = 3;
        class LocalC { // o clasa locala
            int x = 10;
            void m() {
                System.out.println(this.x);
                System.out.println(C.this.x);
                System.out.println(z);
            }
        }
        
        //z = 4;
        
        
    }
}