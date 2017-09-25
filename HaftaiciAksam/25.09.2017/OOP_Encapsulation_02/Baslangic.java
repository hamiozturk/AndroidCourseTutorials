import java.util.Scanner;


public class Baslangic {

	public static void main(String[] args) {
		
		Hayvan hayvan = new Hayvan();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tür giriniz");
		hayvan.setTur(sc.next());
		
		System.out.println("Cinsiyet giriniz");
		hayvan.setCinsiyet(sc.next());
		
		System.out.println("Yaþ giriniz");
		hayvan.setYas(sc.nextInt());
		
		hayvan.getDetaylar();
	}

}
