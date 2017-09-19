import java.util.Scanner;


public class Ornek6 {

	public static String adSoyadDon(String ad,String soyad){
		String adSoyad = ad+" "+soyad;
		return adSoyad;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ad giriniz");
		String isim = sc.next();
		System.out.println("Soyad giriniz");
		String soyisim = sc.next();
		System.out.println(adSoyadDon(isim,soyisim)); // "þerif güngör"
	}

}
