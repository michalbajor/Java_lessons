package lesson9;

import lesson9.Instrument.Category;

public class RunTest {
	public static void main(String[] args) {
		Instrument instrument = new Instrument("Róg", Category.BRASS);
		Player player = new Player ("D¿on", "Smif", instrument);
		Player player2 = player;
		System.out.println(player);
		System.out.println(player.firstName);
		player = null; 
 		player = new Player("Peter", "Asfasd", instrument);
		System.out.println(player.firstName);
		
		player.playSong("Last Christmas");
	}

}