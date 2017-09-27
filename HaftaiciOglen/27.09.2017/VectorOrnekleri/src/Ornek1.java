import java.util.Vector;


public class Ornek1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		vector.add("One");
		vector.add("Two");
		vector.add("Three");
		
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
		vector.remove("One");
		System.out.println("---");
		
		for (String eleman : vector) {
			System.out.println(eleman);
		}

	}

}
