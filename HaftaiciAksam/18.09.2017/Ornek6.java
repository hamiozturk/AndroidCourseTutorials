import java.util.Scanner;


public class Ornek6 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç adet kelime gireceksiniz ?");
		int sayi = sc.nextInt();
		
		String[] kelimeler = new String[sayi];
		
		for (int i = 0; i < sayi; i++) {
			System.out.println("Kelime giriniz");
			kelimeler[i] = sc.next();
		}
		
		String geciciMetin = "";
		
		for (int i = 0; i < kelimeler.length; i++) {
			geciciMetin = geciciMetin + kelimeler[i].charAt(0);
			//geciciMetin += kelimeler[i].charAt(0);
		}
		
		System.out.println(geciciMetin);
		

	}

}
