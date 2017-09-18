import java.util.Scanner;


public class Ornek3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kaç adet kelime gireceksiniz ?");
		int sayi = sc.nextInt();
		String[] dizi = new String[sayi];
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println((i+1)+" kelimeyi giriniz");
			dizi[i] = sc.next();
		}
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
		
		

	}

}
