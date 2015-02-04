package lesson10;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transmission transmission = new Transmission(false, 6);
		Engine engine = new Engine(2000, 165);
		Car car = new Car(4, "sjfaniw", transmission, engine); // transmission i
																// engine tutaj
																// to referencje
		car.color = Color.RED;
		System.out.println(car);
	}

}