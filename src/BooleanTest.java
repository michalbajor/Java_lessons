public class BooleanTest {

	public static void main(String[] args) {

		int age = 18;

		if (age > 17) {
			System.out.println("Grab your beer");
		} else {
			System.out.println("Get the F*** out");
		}

		String name;
		name = "Anna";

		if (name == "Anna") {
			System.out.println("Siema " + name);
		}
		if (name.equals("Anna")) {
			System.out.println("Siema " + name);
		}
	}
}
