import java.util.Scanner;

public class ScannerKullanimi {

	public static void main(String[] args) {
		
		//DI�ARIDAN VER� ALMA �RNE��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("L�tfen ya��n�z� giriniz;");
		int sayi = sc.nextInt();
		System.out.println("L�tfen isminizi giriniz");
		String yazi = sc.next();
		
		System.out.println("Ya��n�z: "+sayi);
		System.out.println("�sminiz: "+yazi);
		
	}

}
