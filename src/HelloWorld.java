
public class HelloWorld {

	private String message = "Hello my world";
	
	public void sayHello() {
		System.out.println(message);
		
	}
	
	public static void main(String[] args) {
		int age;
		
		String name;
		
		age = 16;
		
		name = "Michal";
		
		System.out.println(name + " is " + age + " years old ");
		
		name = "Janusz";
		System.out.println(name + " is " + age + " years old ");
		
		int x;
		int y;
		int z;
		
		x = 10;
		y = 2;
		
		z = x + y;
		System.out.println(z);
		
		z = x - y;
		System.out.println(z);
		
		z = x * y;
		System.out.println(z);
		
		z = x / y;
		System.out.println(z);
		
		z = x;
	}
}
