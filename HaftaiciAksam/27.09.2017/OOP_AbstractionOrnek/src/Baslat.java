
public class Baslat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Isci isci = new Isci();
		// class'� abstract yapt���m�z i�in do�rudan �retilmesini engelledik
		
		Isci isci2 = new Patron();
		//do�rudan classa eri�emedi�imiz 
		//i�in farkl� s�n�f� kal�t�m yoluyla kullanabildik.
		isci2.isciKonustu();
		
		

	}

}
