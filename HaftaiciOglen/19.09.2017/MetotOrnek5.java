import java.util.Scanner;


public class MetotOrnek5 {

	public static void akrostiseCevir(){
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

	public static void main(String[] args) {
		akrostiseCevir();
	}

}
