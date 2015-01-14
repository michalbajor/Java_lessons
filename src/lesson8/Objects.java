package lesson8;

public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Man.getPopulation());
		Man bolek = new Man("Nabuchonodozor", 3600, 180);
		Man lolek = new Man("Wies³aw", 342, 190);
		System.out.println("Name: " + bolek.name + ", " + "Age: " + bolek.age);
		System.out.println("Name: " + lolek.name + ", " + "Age: " + lolek.age);
		bolek.name = "Bartek";
		lolek.name = "Wac³aw";
		bolek.age = 67;
		lolek.age = 11;
		bolek.introduceYourself();
		lolek.introduceYourself();
		lolek.getOlder(10);
		lolek.introduceYourself();
		System.out.println(Man.getPopulation());
	}

}
// class samochód z ciekawymi rzeczami, np. opony i silnik (przydadz¹ siê!)
class Man {
	private static int population;
	private static int avarageAge;
	private static int avarageHeight;
	private static int avarageWeight;
	String name;
	int age;
    int height;
    int weight;
    
    public double calculateBMI() { 
    return 0;
    }
   
	public Man() {
		name = "Adam";
		age = 31;
		population ++;
	}

	public Man(String name, int age, int height) {
		this.name = name;
		this.age = age;
		population ++;

	}
 public static int getPopulation(){
	 return population;
 }
	public void introduceYourself() {
		System.out.println("Name: " + this.name + ", " + "Age: " + this.age);

	}

	public void getOlder(int years) {
		age = age + years;

	}

}