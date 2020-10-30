
package example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread2 extends Thread{

    @Override
    public void run() {
        while(SharedData.getInstance().checkAvaiable()) {
            synchronized(SharedData.getInstance()) {
                SharedData.getInstance().notifyAll();
                try {
                    SharedData.getInstance().wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                char c = SharedData.getInstance().getC();
                int code = (int) c - 32;
                c = (char) code;

                System.out.println("Thread 2 >> " + c);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
                SharedData.getInstance().addTime(1000);
            }
        }
        
        System.out.println("Stop Thread2");
        
        synchronized(SharedData.getInstance()) {
            SharedData.getInstance().notifyAll();
        }
    }
    
}
