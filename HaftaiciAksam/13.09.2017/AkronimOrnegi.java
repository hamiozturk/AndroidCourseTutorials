import java.util.Scanner;


public class AkronimOrnegi {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Sayý giriniz");
		int sayi = sc.nextInt();
		
		String gecici = "";
		String yeniKelime = "";
		
		for (int i = 0; i < sayi; i++) {
			System.out.println("Kelime giriniz");
			gecici = sc.next();
			yeniKelime = yeniKelime + gecici.charAt(0);
		}
		System.out.println(yeniKelime);

	}

}
