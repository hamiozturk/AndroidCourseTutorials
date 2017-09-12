import java.util.Scanner;

public class ScannerKullanimi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ad,soyad;
		int yas;
		
		System.out.println("Lütfen isim giriniz");
		ad = sc.next();
		System.out.println("Lütfen soyad giriniz");
		soyad = sc.next();
		System.out.println("Lütfen yaþ giriniz");
		yas = sc.nextInt();
		
		System.out.println(ad+" "+soyad+" "+yas);
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("1.sayýyý giriniz");
		int sayi1 = sc.nextInt();
		System.out.println("2.sayýyý giriniz");
		int sayi2 = sc.nextInt();
		
		int toplama = sayi1+sayi2;
		int carpma = sayi1*sayi2;
		int cikarma = sayi1-sayi2;
		int bolme = sayi1/sayi2;
		
		System.out.println("Toplama: "+toplama);
		System.out.println("Çýkarma: "+cikarma);
		System.out.println("Çarpma: "+carpma);
		System.out.println("Bölme: "+bolme);
		*/
		

	}

}
