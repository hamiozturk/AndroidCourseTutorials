import java.util.Scanner;

public class MetotOrnek2 {

	public int hesapla(int sayi1, int sayi2, String islem) {
		int sonuc = 0;
		if ("topla".equals(islem)) {
			sonuc = sayi1 + sayi2;
		} else if ("cikar".equals(islem)) {
			sonuc = sayi1 - sayi2;
		} else if ("carp".equals(islem)) {
			sonuc = sayi1 * sayi2;
		} else if ("bol".equals(islem)) {
			sonuc = sayi1 / sayi2;
		}
		return sonuc;
	}
	
	
	

	public static void main(String[] args) {
		
		

		Ornek2 ornek2 = new Ornek2();

		Scanner sc = new Scanner(System.in);

		System.out.println("1. sayýyý giriniz");
		int sayi1 = sc.nextInt();

		System.out.println("2. sayýyý giriniz");
		int sayi2 = sc.nextInt();

		System.out.println("Ýþlem giriniz (topla,cikar,carp,bol)");
		String islem = sc.next();

		int sonuc = ornek2.hesapla(sayi1, sayi2, islem);
		System.out.println("Sonuç: " + sonuc);

	}

}
