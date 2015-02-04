package lesson10;

public class Engine {
	int volume;
	int power; 

	public Engine (int volume, int power){
		this.volume = volume;
		this.power = power;
	}

	public String toString() {
		return "Engine [volume=" + volume + ", power=" + power + "]";
	}
	

}
