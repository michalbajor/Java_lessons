package lesson9;

import lesson9.Instrument.Category;

public class Player {
	public String firstName;
	public String lastName;
	public Instrument instrument;
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
	public void playSong(String songName) {
		System.out.println(songName);
	}

}
