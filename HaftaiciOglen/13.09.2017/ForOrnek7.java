
public class Ornek7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int sayac = 0;
		
		for (int i = 0; i < 10; i++) {
			sayac +=1; // sayac = sayac +1;
			for (int j = 0; j < 50; j++) {
				sayac +=1;
			}
		}
		
		System.out.println(sayac);

	}

}
