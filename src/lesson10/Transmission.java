package lesson10;

public class Transmission {
	boolean automatic;
	int gears;
	public Transmission(boolean automatic, int gears) {
		super();
		this.automatic = automatic;
		this.gears = gears;
	}
	
	public String toString() {
		return "Transmission [automatic=" + automatic + ", gears=" + gears
				+ "]";
	}
	
	

}
