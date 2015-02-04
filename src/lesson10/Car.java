package lesson10;

public class Car {
	int doors;
	String plates;
	Transmission transmision; 
	Color color;
	Engine engine;
	public Car(int doors, String plates, Transmission transmision, Engine engine) {
		super();
		this.doors = doors;
		this.plates = plates;
		this.transmision = transmision;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [doors=" + doors + ", plates=" + plates + ", transmision="
				+ transmision + ", color=" + color + ", engine=" + engine + "]";
	}

}
