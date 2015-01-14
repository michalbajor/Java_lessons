package utils;

public class Utils {
	public static void printArray(int[] v) {
		System.out.print("[");
		for (int j = 0; j < v.length; j++) {

			System.out.print(v[j]);
			if (j < v.length - 1) {
				System.out.print(", ");

			}
		}
		System.out.println("]");
	}
}
