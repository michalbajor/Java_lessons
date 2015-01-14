package lesson3;

public class IsAdult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isMichalAdult = isAdult(21);
		boolean isBogdanAdult = isAdult(7);
		
		printMaturity("Michal", isAdult(21));
		printMaturity("Bogddan", isAdult(7));
		

	}

	public static void printMaturity(String name, boolean isAdult) {
		if (isAdult == true) {
			System.out.println(name + " jest dorosly ");

		} else {
			System.out.println(name + " nie jest dorosly");

		}

	}

	public static boolean isAdult(int age) {
		if (age > 17) {
			return true;
		} else {
			return false;
		}
	}
}
