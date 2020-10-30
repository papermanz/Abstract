package threadexample;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Thread2 extends Thread {
	@Override
    public void run() {
        while (SharedData.getInstance().isRunning()) {            
            synchronized(SharedData.getInstance()) {
                //Kiem tra xem T2 > co duoc phep chay hay ko
                SharedData.getInstance().notifyAll();
                
                        try {
                            while (SharedData.getInstance().isRunning() && SharedData.getInstance().getIndex() != SharedData.INDEX_THREAD_2) {                        
							SharedData.getInstance().wait();
                            }
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}              
            
                //Neu dc chay
                int rad = SharedData.getInstance().getRad();
                int r = rad * rad;
                System.out.println("T2 >> So Binh Phuong >> " + r);
                
                SharedData.getInstance().setIndex(SharedData.INDEX_THREAD_1);
            }
        }
        
        System.out.println("T2 Stop");
        synchronized(SharedData.getInstance()) {
            SharedData.getInstance().notifyAll();
        }
    }

}

