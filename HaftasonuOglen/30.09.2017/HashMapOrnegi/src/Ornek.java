import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;


public class Ornek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Elma", "Apple");
		map.put("Klavye", "Keyboard");
		map.put("Masa", "Desk");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kelime giriniz");
		String kelime = sc.next();
		
		if(map.containsKey(kelime)){
			System.out.println(map.get(kelime));
		}else{
			System.out.println("Kelime sözlükte bulunamadý");
		}

		Vector<String> v = new Vector<String>();
		
		
		

	}

}
