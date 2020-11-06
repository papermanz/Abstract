package prototypepattern;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub    
		ConcretePrototype1 p = new ConcretePrototype1(100);
 
        for (int i = 0; i < 10; i++) {
            Prototype pclone = p.clone();
            pclone.setX(p.getX()*i);
            pclone.printX();
        }
    }
}


	