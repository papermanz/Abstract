package partternexample;

public class Apple extends SmartPhone {
	
	public Apple (String model) {
		this.setPrice(23000000);
		this.setModel(model);
	}
	
	public Apple clone() throws CloneNotSupportedException {
		return (Apple) super.clone();
		
	}

}
