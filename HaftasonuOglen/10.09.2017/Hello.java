import java.util.Scanner;



public class Hello {

	public static void main(String[] args) {
	
		// YORUM SATIRI
		/*
		  A�IKLAMA SATIRLARI
		 */
		
		// System.out.print("MERHABA ANDRO�D"); //TEK SATIR

		// System.out.println("MERHABA\nANDRO�D\n:)"); // \n yeni sat�r
		
		/*
		System.out.println("MERHABA");
		System.out.println("JAVA");
		
		System.out.print("MERHABA");
		System.out.print("ANDRO�D");
		*/
		
		
		
		/*
		// DE���KEN KULLANIMLARI

		int sayii = 105;
		String sayi = "Android Programlama";
		char karakter = 'A';
		boolean deger = false;
		double d = 10.5d;
		float f = 20.7f;
		long l = 1000054546;
		short s = 5000;
		byte b = -128; // -128 - 127 aras� say� tutar
		
		System.out.println(sayii);
		System.out.println(sayi+" "+sayii);
		
		// D�RT TEMEL ��LEM	
		
		int sayi1, sayi2;
		sayi1 = 10;
		sayi2 = 20;
		
		System.out.println("Toplam: "+(sayi1+sayi2));
		System.out.println("�arp�m: "+(sayi1*sayi2));
		System.out.println("B�l�m: "+(sayi2/sayi1));
		System.out.println("��karma: "+(sayi1-sayi2));
		
		*/
		
		
		//DI�ARIDAN VER� ALMA �RNE��
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("L�tfen ya��n�z� giriniz;");
		int sayi = sc.nextInt();
		System.out.println("L�tfen isminizi giriniz");
		String yazi = sc.next();
		
		System.out.println("Ya��n�z: "+sayi);
		System.out.println("�sminiz: "+yazi);
		*/
		
		
		/*
		
		String str = "YUNAN�STANBULGAR�STAN";

		System.out.println(str.length());
		// uzunlu�u d�ner
		System.out.println(str.substring(5, 13));
		// string i�erisinde ba�lang�� biti� de�erleri aras�ndaki karakterleri d�ner
		System.out.println(str.toLowerCase());
		// T�m karakterleri k���k harfe d�n��t�r�r
		System.out.println(str.toUpperCase());
		// T�m karakterleri b�y�k harfe d�n��t�r�r
		System.out.println(str.charAt(0));
		//charAt i'ninci indisin karakterini d�ner
		System.out.println(str.indexOf("�STANBUL"));
		//ARANAN KEL�ME VARSA �LK BULDU�U �ND�S�, YOKSA -1'i d�ner
		System.out.println(str.lastIndexOf("�STANBUL"));
		//ARANAN KEL�MEDE SON BULDU�U �ND�S�, YOKSA -1'i d�ner
		
		*/
		
		// �ARTLI ��LEMLER

		/*
		 
		String metin = "android";
		Scanner sc = new Scanner(System.in);
		System.out.println("Buras� hangi s�n�f ?");
		String girilen = sc.next();
		
		if(girilen.equals(metin)){
			System.out.println("android do�ru s�n�f !");
		}else if("java".equals(girilen)){
			System.out.println("java s�n�f�na ho� geldiniz !");
		}else{
			System.out.println("yanl�� s�n�fa geldiniz !");
		}
		*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Kullan�c� ad� giriniz");
		String uname = sc.next();
		System.out.println("Kullan�c� �ifre giriniz");
		String upw = sc.next();
		
		if("root".equals(uname) && "1234".equals(upw)){
			
		}
		// kullan�c� ad� ve �ifre do�ru ise
		
		 /*
		 if("root".equals(uname) || "1234".equals(upw)){
		 }
		 // kullan�c� ad� yada �ifre do�ru ise
		 */
		

		
		
		

	}

}
