import java.util.Scanner;

public class ScannerKullanimi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ad,soyad;
		int yas;
		
		System.out.println("L�tfen isim giriniz");
		ad = sc.next();
		System.out.println("L�tfen soyad giriniz");
		soyad = sc.next();
		System.out.println("L�tfen ya� giriniz");
		yas = sc.nextInt();
		
		System.out.println(ad+" "+soyad+" "+yas);
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("1.say�y� giriniz");
		int sayi1 = sc.nextInt();
		System.out.println("2.say�y� giriniz");
		int sayi2 = sc.nextInt();
		
		int toplama = sayi1+sayi2;
		int carpma = sayi1*sayi2;
		int cikarma = sayi1-sayi2;
		int bolme = sayi1/sayi2;
		
		System.out.println("Toplama: "+toplama);
		System.out.println("��karma: "+cikarma);
		System.out.println("�arpma: "+carpma);
		System.out.println("B�lme: "+bolme);
		*/
		

	}

}
