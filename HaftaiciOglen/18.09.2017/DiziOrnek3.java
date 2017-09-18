import java.util.Scanner;


public class DiziOrnek3 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kaç adet eleman girilecek ?");
		int sayi = sc.nextInt();
		int[] sayiDizisi = new int[sayi];
		int toplam = 0;
		
		for (int i = 0; i < sayi; i++) {
			sayiDizisi[i] = sc.nextInt();
			toplam = toplam + sayiDizisi[i];
		}
		
		for (int i = 0; i < sayiDizisi.length; i++) {
			System.out.println(sayiDizisi[i]);
		}
		
		System.out.println("---\n---\nToplam: "+toplam);
		

	}

}
