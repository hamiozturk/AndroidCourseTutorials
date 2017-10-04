
public class Ornek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Ev ev = new Ev(i);
		}
		
		System.out.println("---");
		System.gc(); // kullanýlmayan nesneleri toptan yok eder.
		
		System.out.println("---");
		
		for (int i = 0; i < 10; i++) {
			Ev ev = new Ev(i);
		}
		

	}

}
