package threadexample;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Random;

public class Thread1 extends Thread {
	@Override
    public void run() {
        Random random = new Random();
        
        while (SharedData.getInstance().isRunning()) {            
            synchronized(SharedData.getInstance()) {
                int rad = random.nextInt(100) + 1;
                System.out.println("T1 >> " + rad);
                SharedData.getInstance().setRad(rad);
                
                //Xac dinh xem luong dc duoc chay
                if(rad % 3 == 0) {
                    //notify T2 duoc chay
                    SharedData.getInstance().setIndex(SharedData.INDEX_THREAD_2);
                } else {
                    //notify T3 duoc chay
                    SharedData.getInstance().setIndex(SharedData.INDEX_THREAD_3);
                }

                //Thong bao cho T2, T3 chay
                //T1 => di vao wait
                SharedData.getInstance().notifyAll();  
			
					try {
						SharedData.getInstance().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
					
                
            }
        }
        
        System.out.println("T1 Stop");
        synchronized(SharedData.getInstance()) {
            SharedData.getInstance().notifyAll();
        }
    }
    
}


	

