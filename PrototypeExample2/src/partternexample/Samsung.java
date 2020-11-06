package partternexample;

public class Samsung extends SmartPhone {

	public Samsung(String model) {
		this.setPrice(20000000);
		this.setModel(model);
	}
	
	public SmartPhone clone() throws CloneNotSupportedException {
		return (Samsung) super.clone();
		
	}
	

}
