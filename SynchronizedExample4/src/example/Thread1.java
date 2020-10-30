
package example;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread1 extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int min = (int) 'a';
        int max = (int) 'z';
        
        int delta = max - min;
        
        Random random = new Random();
        
        while(SharedData.getInstance().checkAvaiable()) {
            synchronized(SharedData.getInstance()) {
                int rad = random.nextInt(delta + 1) + min;
                char c = (char) rad;

                SharedData.getInstance().setC(c);

                System.out.println("Thread 1 >> " + c);
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
                SharedData.getInstance().addTime(2000);
                
                //thiet lap trang thai cho + danh thuc thread2
                SharedData.getInstance().notifyAll();
                try {
                    SharedData.getInstance().wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        System.out.println("Stop Thread1");
        synchronized(SharedData.getInstance()) {
            SharedData.getInstance().notifyAll();
        }
    }
    
}
