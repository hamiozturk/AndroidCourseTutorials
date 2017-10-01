import java.util.ArrayList;


public class Baslat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ArrayList<Hayvan> hayvanlar = new ArrayList<Hayvan>();
		hayvanlar.add(new Hayvan("Sarý",2));
		hayvanlar.add(new Hayvan("Siyah",1));
		
		for (Hayvan hayvan : hayvanlar) {
			System.out.println(hayvan.getRenk());
		}
		
	}

}
