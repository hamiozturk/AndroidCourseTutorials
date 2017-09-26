
public class Baslangic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		/*
		 * Employee sýnýfý abstract bir sýnýf olduðu için
		 * doðrudan "=new Object()" þeklinde Nesne üretemeyiz.
		 * 
		 *  Abstract class doðrudan oluþturulamayacaðý (engel olunacaðý) için
		 *  farklý bir class üzerinden Abstract class'a eriþim saðlayabiliriz.
		 *  
		 *  Farklý class'a abstract class'ý extends etmemiz gerekmektedir.
		 * 
		 * 
		 */
		
		  //Employee e = new Employee("George W.", "Houston, TX", 43);
			Employee e = new Test("George W.", "Houston, TX", 43);
	        e.mailCheck();

	}

}
