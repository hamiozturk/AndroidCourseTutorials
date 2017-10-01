import java.util.ArrayList;


public class Ornek1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ArrayList<String> liste = new ArrayList<String>();
		
		liste.add("ANDROÝD");
		liste.add("iOS");
		liste.add("WÝNDOWS");
		liste.add("LÝNUX");
		
		System.out.println("Listenin eleman sayýsý: " + liste.size() );		
		System.out.println("Liste boþ mu: " + liste.isEmpty() );
		liste.remove(1); // i'ninci indis listeden silinir
		System.out.println(liste.get(1));
		liste.clear();	// tüm elemanlarý temizler/siler
		System.out.println("Liste boþ mu: " + liste.isEmpty() );	
		
		liste.add("ANDROÝD");
		liste.add("iOS");
		
		System.out.println("Listede arama iþlemi: "+liste.contains("ANDROÝD"));
		liste.set(0, "JAVA"); //i'ninci indisin deðerini deðiþtirir
		
		
		

	}

}
