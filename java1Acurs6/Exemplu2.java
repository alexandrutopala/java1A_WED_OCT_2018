public class Exemplu2 {
    public static void main(String [] args) {
        System.out.println("A");
        
        try {
            m(3);
        } catch (MyException e) { 
            System.out.println("D");
            
            System.out.println(e.getMessage());
            System.out.println(e);
        } catch (NullPointerException | MyRuntimeException e) {
            System.out.println("E");
        } finally {
            
            System.out.println("C");
        }
        
        System.out.println("B");
        
    }
    
    // metoda m propaga MyException
    private static void m(int i) throws MyException, NullPointerException {
        
        switch (i) {
            case 1 : 
                MyRuntimeException e1 = new MyRuntimeException();
                throw e1; // semnaleaza aparia unui caz de exceptie in flow-ul aplicatiei
                //break;
                
            case 2 : 
                throw new MyException();
            case 3 : 
                throw new NullPointerException("test");
        }
    }
    
    
    
    
    
    
    
    
    
}