package lesson3;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello ("Micha�");
		
		

	}
// public static TYP_ZWRACANY nazwa_metody (Typ_parametru nazwa_parametru, typ_parametru nazwa_parametru)
// void - specjalny typ: metoda nic nie zwraca
// return - u�ye w metodzie powoduje natychmiastowe zako�czenie metody i opcjonalne zwr�cenie rezultatu
	
	public static void sayHello (String name){
		System.out.println("Hello " + name);
	}
}
