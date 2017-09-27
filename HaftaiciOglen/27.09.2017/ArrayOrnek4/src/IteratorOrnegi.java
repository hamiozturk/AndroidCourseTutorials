import java.util.ArrayList;
import java.util.Iterator;


public class IteratorOrnegi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Ogrenci ogrenci1 = new Ogrenci(1,"Ahmet","Er",20);
		Ogrenci ogrenci2 = new Ogrenci(2,"Emre","Türk",25);
		
		ArrayList<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();
		
		ogrenciListesi.add(ogrenci1);
		ogrenciListesi.add(ogrenci2);
		
		Iterator itr = ogrenciListesi.iterator();
		
		while (itr.hasNext()) {
			Ogrenci ogr = (Ogrenci)itr.next();
			System.out.println(
					"Öðrenci Adý: "+ogr.ad+
					" Öðrenci Soyadý: "+ogr.soyad+
					" Öðrenci Yaþý: "+ogr.yas+
					" Öðrenci No: "+ogr.ogrenciNo
					);
		}
		
		

	}

}
