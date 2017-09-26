import java.util.Scanner;


public class Baslangic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Insan insan = new Insan();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("İsim giriniz");
		insan.setIsim(sc.next());
		
		System.out.println("Cinsiyet giriniz (e/k)");
		char cinsiyet = sc.next().toLowerCase().charAt(0);
		insan.setCinsiyet(cinsiyet);
		
		System.out.println("Medeni durumu (evli/bekar)");
		char medeniDurum = sc.next().toLowerCase().charAt(0);
		if (medeniDurum=='e') {
			insan.setEvliMi(true);
		}else if(medeniDurum=='b'){
			insan.setEvliMi(false);
		}
		
		System.out.println("Yaş giriniz");
		insan.setYas(sc.nextInt());
		
		System.out.println("Boy uzunluğu giriniz");
		insan.setBoy(sc.nextInt());
		
		System.out.println("Kilo giriniz");
		insan.setKilo(sc.nextInt());
		
		insan.getTumKisiDetaylari();
		
		

	}

}
