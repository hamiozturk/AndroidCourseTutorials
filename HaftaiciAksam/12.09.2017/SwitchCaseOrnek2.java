import java.util.Scanner;


public class Ornek2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�lk say�y� giriniz");
		int sayi1 = sc.nextInt();
		System.out.println("�kinci say�y� giriniz");
		int sayi2 = sc.nextInt();
		System.out.println("��lem giriniz (topla,cikar,carp,bol)");
		String islem = sc.next();		
		int sonuc = 0;
		
		switch (islem) {
			case "topla":
				sonuc = sayi1+sayi2;
				System.out.println(sonuc);
				break;
			case "cikar":
				sonuc = sayi1-sayi2;
				System.out.println(sonuc);
				break;
			case "carp":
				sonuc = sayi1*sayi2;
				System.out.println(sonuc);
				break;
			case "bol":
				sonuc = sayi1/sayi2;
				System.out.println(sonuc);
				break;	
			default:
				System.out.println("Hatal� i�lem");
				break;
		}

	}

}
