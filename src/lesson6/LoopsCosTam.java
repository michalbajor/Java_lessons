package lesson6;

import utils.Utils;

public class LoopsCosTam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] np = new int[26];
		int a;
		int b = 0;
		for (a = 1; a < 50; a = a + 2) {
			np[a / 2] =  a;
			System.out.print(a);
			if (a != 49) {
				System.out.print(", ");
				
			}
			

		}
		System.out.println();
		Utils.printArray(np);

	}

}
