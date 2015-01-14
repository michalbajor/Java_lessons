package lesson9;

import lesson9.Instrument.Category;

public class Player {
	private String firstName;
	private String lastName;
	private Instrument instrument;
	public Player(String firstName, String lastName, Instrument instrument) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.instrument = instrument;
	}
	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", lastName=" + lastName
				+ ", instrument=" + instrument + "]";
	}
	public static void main(String[] args) {
		Instrument instrument = new Instrument("Róg", Category.BRASS);
		Player player = new Player ("D¿on", "Smif", instrument);
		System.out.println(player);
	}
	

}
