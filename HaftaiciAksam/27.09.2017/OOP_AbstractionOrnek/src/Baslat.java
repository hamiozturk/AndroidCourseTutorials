
public class Baslat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Isci isci = new Isci();
		// class'ý abstract yaptýðýmýz için doðrudan üretilmesini engelledik
		
		Isci isci2 = new Patron();
		//doðrudan classa eriþemediðimiz 
		//için farklý sýnýfý kalýtým yoluyla kullanabildik.
		isci2.isciKonustu();
		
		

	}

}
