import java.util.*;

public class Producator extends Thread {
    
    public Producator() {
        super("Producator-thread");
    }
    
    @Override
    public void run() {
        Random r = new Random();
        
        
        
        while (true) {
            try {
                synchronized (Exemplu2.list) {
                    int x = r.nextInt(100);
                   
                    if (Exemplu2.list.size() < 50) {
                        Exemplu2.list.add(x);
                        System.out.println("PRODUS " + x);
                        Exemplu2.list.notifyAll();
                    } else {
                        Exemplu2.list.wait();
                    }
                }
            } catch (InterruptedException e) {
            }
        }
    }
}








