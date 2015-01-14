
public class Bar {

	public static void main(String[] args) {
		System.out.println(args [0]);
		System.out.println(args [1]);
		
		int age;
		age = Integer.valueOf(args [0]);
		String name;
		name = args [1];
		
		if (age > 17) {
			System.out.println("Grab your beer");
		} else { 
			System.out.println("Go out!");	
		}
		if (age > 60) {
			System.out.println("You pay 5% less, becouse you're over 60!");
		}
		
		if ( "Janusz".equals(name)) {
			System.out.println("Janusz! Here's 15% off!");
			
		}
		
		
	}

}
