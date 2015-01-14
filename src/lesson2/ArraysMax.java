package lesson2;

public class ArraysMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.valueOf(args[0]);
		for (int i = 1; i < args.length; i++) {
			int x = Integer.valueOf(args[i]);
			if (x > max) {
				max = x;
			}

		}
		System.out.println(max);
	}
}
