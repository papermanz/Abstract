
package example;


public class SharedData {
    char c;
    int totalTime = 0;
    
    private static SharedData instance = null;
    
    private SharedData() {
    }
    
    public synchronized static SharedData getInstance() {
        if(instance == null) {
            instance = new SharedData();
        }
        return instance;
    }

    public void addTime(int more) {
        totalTime += more;
    }
    
    public boolean checkAvaiable() {
        return totalTime <= 20000;
    }
    
    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }
    
    
}
