
public class Baslangic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		/*
		 * Employee s�n�f� abstract bir s�n�f oldu�u i�in
		 * do�rudan "=new Object()" �eklinde Nesne �retemeyiz.
		 * 
		 *  Abstract class do�rudan olu�turulamayaca�� (engel olunaca��) i�in
		 *  farkl� bir class �zerinden Abstract class'a eri�im sa�layabiliriz.
		 *  
		 *  Farkl� class'a abstract class'� extends etmemiz gerekmektedir.
		 * 
		 * 
		 */
		
		  //Employee e = new Employee("George W.", "Houston, TX", 43);
			Employee e = new Test("George W.", "Houston, TX", 43);
	        e.mailCheck();

	}

}
