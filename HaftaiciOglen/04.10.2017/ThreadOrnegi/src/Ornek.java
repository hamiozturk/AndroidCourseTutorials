import java.util.ArrayList;


public class Ornek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("ANDROÝD");
		liste.add("JAVA EE");
		liste.add("iOS");
		liste.add("JAVA SE");
		
		ThreadOlustur to = new ThreadOlustur(3, liste);
		to.start();
		
		
		

	}

}
