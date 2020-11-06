package patternexample;

public class Computer implements Cloneable {
	private String os;
	private String brower;
	private String gamesOnline;
	private String gamesOffline;
	private String other;
	
	
	
	public Computer(String os, String brower, String gamesOnline, String gamesOffline, String other) {
		super();
		this.os = os;
		this.brower = brower;
		this.gamesOnline = gamesOnline;
		this.gamesOffline = gamesOffline;
		this.other = other;
	}

	protected Computer clone() {
		
		try {
			return (Computer) super.clone() ;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public void setOther(String other) {
		this.other = other;
	}
	
	@Override
	public String toString() {
		return "Computer [os=" + os + ", brower=" + brower + ", gamesOnline=" + gamesOnline + ", gamesOffline="
				+ gamesOffline + ", other=" + other + "]";
	}
	

}
