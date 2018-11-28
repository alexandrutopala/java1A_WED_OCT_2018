public class EvenNumbersThread extends Thread {
    @Override
    public void run() { 
        // metoda run va contine instructiunile care se vor executa in paralel
        for (int i = 2; i <= 50; i += 2) {
            try {
                
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println(i);
        }
    }
}