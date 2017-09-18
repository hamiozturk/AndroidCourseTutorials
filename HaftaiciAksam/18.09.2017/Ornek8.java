import java.util.Scanner;


public class Ornek8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç adet kelime girilecek ?");
		int uzunluk = sc.nextInt();
		String[] kelimeler = new String[uzunluk];
		
		for (int i = 0; i < kelimeler.length; i++) {
			kelimeler[i] = sc.next();
		}
		
		for (int i = 0; i < kelimeler.length; i++) {
			System.out.println(kelimeler[i]);
		}
		
		System.out.println("Kaçýncý eleman temizlensin ?");
		
		int elemanIndisi = sc.nextInt();
		
		for (int i = 0; i < kelimeler.length; i++) {
			if(i == elemanIndisi){
				kelimeler[i] = null;
			}
		}
		
		
		System.out.println("---");
		
		for (int i = 0; i < kelimeler.length; i++) {
			System.out.println(kelimeler[i]);
		}
		

	}

}
