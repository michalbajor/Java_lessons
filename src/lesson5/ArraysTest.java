package lesson5;

import utils.Utils;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[4];

		a[0] = 10;
		a[1] = a[0] + 10;
		a[2] = a[1] + a[0];
		a[3] = a[2] + a[1];

		int c = 0;
		System.out.println(a[c++]);
		System.out.println(a[c++]);
		System.out.println(a[c++]);
		System.out.println(a[c]);

		System.out.println(a[3] < a[2] + a[0]);

		System.out.println(a.length);

		System.out.println(a[a.length - 1]);

		int[] array = new int[] { 1, 3, 4, 6, 2, 4 }; // szybszy sposób na
														// stworzenie tablicy
														// jeœli wiemy jakie
														// bêd¹ elementy

		array(a);
		
		Utils.printArray(a);
	}

	public static void array(int[] v) {
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
