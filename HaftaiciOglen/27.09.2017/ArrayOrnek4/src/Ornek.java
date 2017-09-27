import java.util.ArrayList;


public class Ornek {

	public static void main(String[] args) {
		
		ArrayList<String>  gunler = new ArrayList<String>();
		
		gunler.add("Pazartesi");
		gunler.add("Sal�");
		gunler.add("�ar�amba");
		gunler.add("Per�embe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		
		gunler.set(4, "CUMA");
		// i'ninci indisin de�erine atama yapar
		
		for (int i = 0; i < gunler.size(); i++) {
			System.out.println(gunler.get(i));
		}
		System.out.println("--");
		
		for(String gun : gunler){//FOREACH
			System.out.println(gun);
		}
		
		/*
		 * 
		 * ARRAYL�ST METOTLARI
		 * 
		 * add - Diziye eleman ekler
		 * size - Listenin eleman say�s�n� d�ner
		 * get - Dizinin istenilen eleman�n� d�ner
		 * remove - Diziden istenilen indisi kald�r�r
		 * set - istenilen indisin yeni de�eri atan�r
		 * clear - listenin i�eri�ini  tamamen temizler
		 * contains - Dizide eleman aramas� yapar. Var m� yok mu
		 * indexOf - Dizide eleman aramas� yapar. Bulunca indisi,
		 * bulamazsa -1'i d�ner.
		 * 
		 * 
		 */
		
		
	}

}
