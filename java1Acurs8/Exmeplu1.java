public class Exmeplu1 {
    public static void main(String [] args) {
        Cutie c1 = new Cutie(); // subinteles: new Cutie<Object>();
        Cutie<String> c2 = new Cutie<String>(); 
        // c2 poate retine doar instante de Cutie care au ca tip generic pe String
        Cutie<?> c3 = new Cutie<Integer>(); 
        // c3 poate retine  instante de Cutie care au orice tip generic 
        
        Cutie<? extends Number> c4 = new Cutie<Integer>();
        // c4 poate retine doar instante de Cutie care au ca tip generic pe Number 
        // sau pe oricine care mosteneste pe Number
        
        Cutie<? super Number> c5 = new Cutie<Object>();
        // c5 poate retine doar instante de Cutie care au ca tip generic pe Number 
        // sau pe oricine pe care Number mosteneste
        
        
        Cutie<Integer> c6 = new Cutie<>();
        
        new Cutie< Cutie< Cutie<String> > >();
        
        
        
        
        
        
        
        
        
        
        
        new Cutie<int[]>();
    }
}