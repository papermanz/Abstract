package threadexample;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Thread3 extends Thread {
	@Override		
    public void run() {
        while (SharedData.getInstance().isRunning()) {            
            synchronized(SharedData.getInstance()) {
                //T3 - Kiem tra xem co dc chay hay ko
                SharedData.getInstance().notifyAll();
   
                        try {
                           while (SharedData.getInstance().isRunning() && SharedData.getInstance().getIndex() != SharedData.INDEX_THREAD_3) {                        
							SharedData.getInstance().wait();
                           }
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
             
            
                //T3 >> duoc chay
                int rad = SharedData.getInstance().getRad();
                if(rad % 4 == 0) {
                    System.out.println("T3 >> chia het cho 4");
                } else {
                    System.out.println("T3 >> khong chia het cho 4");
                }
                
                SharedData.getInstance().setIndex(SharedData.INDEX_THREAD_1);
            }
        }
        
        System.out.println("T3 Stop");
        synchronized(SharedData.getInstance()) {
            SharedData.getInstance().notifyAll();
        }
    }
    

}

