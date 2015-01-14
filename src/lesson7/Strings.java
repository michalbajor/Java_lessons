package lesson7;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Micha³!";
		System.out.println("String is of length " + name.length());

		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i) + " ");
		}
		String reversename = "";
		System.out.println();
		for (int y = name.length() - 1; y >= 0; y--) {
			System.out.print(name.charAt(y) + " ");
			reversename = reversename + name.charAt(y);
		}

		System.out.println();
		System.out.println("reversename" + reversename);
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.substring(0, i + 1));
		}
		System.out.println(name);
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.substring(i, name.length()));
		}

	}
}
