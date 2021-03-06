public class Consumator extends Thread {
    public Consumator() {
        super("Cosnumator-thread");
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                synchronized (Exemplu2.list) {
                    if (!Exemplu2.list.isEmpty()) {
                        int x = Exemplu2.list.get(0);
                        
                        Exemplu2.list.remove(0);
                        System.out.println("CONSUMAT " + x);
                        Exemplu2.list.notifyAll();
                    } else {
                        Exemplu2.list.wait();
                        // firul curent va fi pus in asteptare
                    }
                } 
            } catch (InterruptedException e) {
            }
        }
    }
}