package prototypepattern;

public class ConcretePrototype1 implements Prototype, Cloneable  {
	private int x;
    
    public ConcretePrototype1(int x) {
        setX(x);
    }
     
    @Override
    public void setX(int x) {
        this.x = x;
    }
 
    @Override
    public int getX() {
        return this.x;
    }
 
    @Override
    public void printX() {
        System.out.println("Value: " + this.x);
    }
     
    @Override
    protected ConcretePrototype1 clone() throws CloneNotSupportedException {
        return (ConcretePrototype1)super.clone();
    }

}
