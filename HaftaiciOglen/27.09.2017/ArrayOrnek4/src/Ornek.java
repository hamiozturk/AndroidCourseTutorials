import java.util.ArrayList;


public class Ornek {

	public static void main(String[] args) {
		
		ArrayList<String>  gunler = new ArrayList<String>();
		
		gunler.add("Pazartesi");
		gunler.add("Salý");
		gunler.add("Çarþamba");
		gunler.add("Perþembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		
		gunler.set(4, "CUMA");
		// i'ninci indisin deðerine atama yapar
		
		for (int i = 0; i < gunler.size(); i++) {
			System.out.println(gunler.get(i));
		}
		System.out.println("--");
		
		for(String gun : gunler){//FOREACH
			System.out.println(gun);
		}
		
		/*
		 * 
		 * ARRAYLÝST METOTLARI
		 * 
		 * add - Diziye eleman ekler
		 * size - Listenin eleman sayýsýný döner
		 * get - Dizinin istenilen elemanýný döner
		 * remove - Diziden istenilen indisi kaldýrýr
		 * set - istenilen indisin yeni deðeri atanýr
		 * clear - listenin içeriðini  tamamen temizler
		 * contains - Dizide eleman aramasý yapar. Var mý yok mu
		 * indexOf - Dizide eleman aramasý yapar. Bulunca indisi,
		 * bulamazsa -1'i döner.
		 * 
		 * 
		 */
		
		
	}

}
