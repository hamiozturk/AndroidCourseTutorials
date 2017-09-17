import java.util.Scanner;


public class Ornek6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç adet kelime gireceksiniz ?");
		int sayi = sc.nextInt();
		String gecici = "";
		String sonUretilen = "";
		
		for (int i = 1; i <= sayi; i++) {
			System.out.println(i+". kelimeyi giriniz");
			gecici = sc.next();
			sonUretilen = sonUretilen + gecici.charAt(0);
		}
		System.out.println(sonUretilen);

	}

}
