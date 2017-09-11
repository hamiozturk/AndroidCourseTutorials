import java.util.Scanner;



public class Hello {

	public static void main(String[] args) {
	
		// YORUM SATIRI
		/*
		  AÇIKLAMA SATIRLARI
		 */
		
		// System.out.print("MERHABA ANDROÝD"); //TEK SATIR

		// System.out.println("MERHABA\nANDROÝD\n:)"); // \n yeni satýr
		
		/*
		System.out.println("MERHABA");
		System.out.println("JAVA");
		
		System.out.print("MERHABA");
		System.out.print("ANDROÝD");
		*/
		
		
		
		/*
		// DEÐÝÞKEN KULLANIMLARI

		int sayii = 105;
		String sayi = "Android Programlama";
		char karakter = 'A';
		boolean deger = false;
		double d = 10.5d;
		float f = 20.7f;
		long l = 1000054546;
		short s = 5000;
		byte b = -128; // -128 - 127 arasý sayý tutar
		
		System.out.println(sayii);
		System.out.println(sayi+" "+sayii);
		
		// DÖRT TEMEL ÝÞLEM	
		
		int sayi1, sayi2;
		sayi1 = 10;
		sayi2 = 20;
		
		System.out.println("Toplam: "+(sayi1+sayi2));
		System.out.println("Çarpým: "+(sayi1*sayi2));
		System.out.println("Bölüm: "+(sayi2/sayi1));
		System.out.println("Çýkarma: "+(sayi1-sayi2));
		
		*/
		
		
		//DIÞARIDAN VERÝ ALMA ÖRNEÐÝ
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen yaþýnýzý giriniz;");
		int sayi = sc.nextInt();
		System.out.println("Lütfen isminizi giriniz");
		String yazi = sc.next();
		
		System.out.println("Yaþýnýz: "+sayi);
		System.out.println("Ýsminiz: "+yazi);
		*/
		
		
		/*
		
		String str = "YUNANÝSTANBULGARÝSTAN";

		System.out.println(str.length());
		// uzunluðu döner
		System.out.println(str.substring(5, 13));
		// string içerisinde baþlangýç bitiþ deðerleri arasýndaki karakterleri döner
		System.out.println(str.toLowerCase());
		// Tüm karakterleri küçük harfe dönüþtürür
		System.out.println(str.toUpperCase());
		// Tüm karakterleri büyük harfe dönüþtürür
		System.out.println(str.charAt(0));
		//charAt i'ninci indisin karakterini döner
		System.out.println(str.indexOf("ÝSTANBUL"));
		//ARANAN KELÝME VARSA ÝLK BULDUÐU ÝNDÝSÝ, YOKSA -1'i döner
		System.out.println(str.lastIndexOf("ÝSTANBUL"));
		//ARANAN KELÝMEDE SON BULDUÐU ÝNDÝSÝ, YOKSA -1'i döner
		
		*/
		
		// ÞARTLI ÝÞLEMLER

		/*
		 
		String metin = "android";
		Scanner sc = new Scanner(System.in);
		System.out.println("Burasý hangi sýnýf ?");
		String girilen = sc.next();
		
		if(girilen.equals(metin)){
			System.out.println("android doðru sýnýf !");
		}else if("java".equals(girilen)){
			System.out.println("java sýnýfýna hoþ geldiniz !");
		}else{
			System.out.println("yanlýþ sýnýfa geldiniz !");
		}
		*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Kullanýcý adý giriniz");
		String uname = sc.next();
		System.out.println("Kullanýcý þifre giriniz");
		String upw = sc.next();
		
		if("root".equals(uname) && "1234".equals(upw)){
			
		}
		// kullanýcý adý ve þifre doðru ise
		
		 /*
		 if("root".equals(uname) || "1234".equals(upw)){
		 }
		 // kullanýcý adý yada þifre doðru ise
		 */
		

		
		
		

	}

}
