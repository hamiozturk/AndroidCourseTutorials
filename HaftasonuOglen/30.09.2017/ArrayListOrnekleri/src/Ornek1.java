import java.util.ArrayList;


public class Ornek1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ArrayList<String> liste = new ArrayList<String>();
		
		liste.add("ANDRO�D");
		liste.add("iOS");
		liste.add("W�NDOWS");
		liste.add("L�NUX");
		
		System.out.println("Listenin eleman say�s�: " + liste.size() );		
		System.out.println("Liste bo� mu: " + liste.isEmpty() );
		liste.remove(1); // i'ninci indis listeden silinir
		System.out.println(liste.get(1));
		liste.clear();	// t�m elemanlar� temizler/siler
		System.out.println("Liste bo� mu: " + liste.isEmpty() );	
		
		liste.add("ANDRO�D");
		liste.add("iOS");
		
		System.out.println("Listede arama i�lemi: "+liste.contains("ANDRO�D"));
		liste.set(0, "JAVA"); //i'ninci indisin de�erini de�i�tirir
		
		
		

	}

}
