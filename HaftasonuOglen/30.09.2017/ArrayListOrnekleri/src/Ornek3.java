import java.util.ArrayList;


public class Ornek3 {


	public static void main(String[] args) {
		
		ArrayList<String> gunler = new ArrayList<String>();
		gunler.add("Pazartesi");
		gunler.add("Salý");
		gunler.add("Çarþamba");
		gunler.add("Perþembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");
		gunler.add("Pazar");
		
		gunler.set(4, "CUMA");
		
		Object[] dizi = gunler.toArray(); // ArrayList to Array
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
		for (int i = 0; i < gunler.size(); i++) {
			System.out.println(gunler.get(i));
		}

		for (String gun : gunler) {
			System.out.println(gun);
		}
		
		
	}

}
