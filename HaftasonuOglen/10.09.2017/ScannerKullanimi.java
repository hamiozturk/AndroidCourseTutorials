import java.util.Scanner;

public class ScannerKullanimi {

	public static void main(String[] args) {
		
		//DIÞARIDAN VERÝ ALMA ÖRNEÐÝ
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lütfen yaþýnýzý giriniz;");
		int sayi = sc.nextInt();
		System.out.println("Lütfen isminizi giriniz");
		String yazi = sc.next();
		
		System.out.println("Yaþýnýz: "+sayi);
		System.out.println("Ýsminiz: "+yazi);
		
	}

}
