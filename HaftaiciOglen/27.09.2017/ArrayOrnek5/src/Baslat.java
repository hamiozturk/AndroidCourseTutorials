import java.util.ArrayList;


public class Baslat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Hayvan> hayvanlar = new ArrayList<Hayvan>();
		
		hayvanlar.add(new Hayvan("Kedi","Siyah",1));
		hayvanlar.add(new Hayvan("Kaplan","Sarý",5));
		
		for (Hayvan hayvan : hayvanlar) {
			System.out.println(hayvan.getAd());
		}
		

	}

}
