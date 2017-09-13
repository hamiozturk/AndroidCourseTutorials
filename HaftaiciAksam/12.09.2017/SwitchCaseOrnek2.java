import java.util.Scanner;


public class Ornek2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ýlk sayýyý giriniz");
		int sayi1 = sc.nextInt();
		System.out.println("Ýkinci sayýyý giriniz");
		int sayi2 = sc.nextInt();
		System.out.println("Ýþlem giriniz (topla,cikar,carp,bol)");
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
				System.out.println("Hatalý iþlem");
				break;
		}

	}

}
