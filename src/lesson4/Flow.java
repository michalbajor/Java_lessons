package lesson4;

public class Flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Siema");
		System.out.println("Siema " + 8);
		
		String x = null;
	                            //String x = "cokolwiek"; 
		System.out.println(x); 
		x = "book";
		int y = 0;
		System.out.println(y);
		x = x + y;
		System.out.println(x);
		x = (x + y) + (y + 3) * 2; //book006
		System.out.println(x);
		
		boolean b = true;
		System.out.println(b);
		x = "b = " + b;
		b = true && false;
		b = false || false && true || true;
		System.out.println(b);
		
		b = true == false || true;
		y = 3;
		b = y > 1 || !(y * y != 9);
		String s;
		if (b) {
			 s = "asd";
			 System.out.println(x + s);
		} else {
			 s = null;
		}
				System.out.println(s);
				
	}

}
