package partternexample;

public abstract class SmartPhone implements Cloneable {
	private String model;
	private int price;
	private int vipPrice;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price + this.vipPrice;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public void setVipPrice(int vipPrice) {
		this.vipPrice = vipPrice;
	}
	
	public SmartPhone clone() throws CloneNotSupportedException {
	    return (SmartPhone) super.clone();
	}
	
	@Override
	public String toString() {
		return "SmartPhone [model=" + getModel() + ", price=" + getPrice() + "]";
	}
	

}
