package threadexample;

public class SharedData {
	private static final int MAX = 200;
    public static final int INDEX_THREAD_1 = 1;
    public static final int INDEX_THREAD_2 = 2;
    public static final int INDEX_THREAD_3 = 3;
    
    int rad;
    int total;
    int index;
    
    private static SharedData instance = null;
    
    private SharedData() {
        total = 0;
        index = INDEX_THREAD_1;
    }
    
    public synchronized static SharedData getInstance() {
        if(instance == null) {
            instance = new SharedData();
        }
        return instance;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
        total += rad;
    }
    
    public boolean isRunning() {
        return total <= 200;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}



