
public class Main {


	public static void main(String[] args) {
		
		
		
		//Isci isci = new Isci();
		
		
		Isci isci2 = new Patron();
		isci2.setCalismaSaati(36);
		System.out.println(isci2.getCalismaSaati());
	
		/*
		 * Abstraction ilkesinde classlar�n do�rudan �retilemeyece�i
		 * belirtilmi�tir.
		 * 
		 * Bir class'� olu�turmak istiyorsak farkl� bir s�n�f arac�l��� ile
		 * kal�t�m yolu ile olu�turabiliriz.
		 * 
		 * 
		 */
		
		Patron patron = new Patron();
		
	
	}

}
