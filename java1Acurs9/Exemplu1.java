public class Exemplu1 {
    public static void main(String [] args) {
        EvenNumbersThread t1 = new EvenNumbersThread();
        OddNumbersRunnable runnable = new OddNumbersRunnable();
        
        Thread t2 = new Thread(runnable);
        
        t1.start();
        t2.start();
        
        try {
            t1.join(); // pune firul curent in asteptare, pana se termina
                       // firul t1
            t2.join();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("end main");
    }
}



