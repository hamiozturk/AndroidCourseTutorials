
public class Main {


	public static void main(String[] args) {
		
		
		
		//Isci isci = new Isci();
		
		
		Isci isci2 = new Patron();
		isci2.setCalismaSaati(36);
		System.out.println(isci2.getCalismaSaati());
	
		/*
		 * Abstraction ilkesinde classlarýn doðrudan üretilemeyeceði
		 * belirtilmiþtir.
		 * 
		 * Bir class'ý oluþturmak istiyorsak farklý bir sýnýf aracýlýðý ile
		 * kalýtým yolu ile oluþturabiliriz.
		 * 
		 * 
		 */
		
		Patron patron = new Patron();
		
	
	}

}
