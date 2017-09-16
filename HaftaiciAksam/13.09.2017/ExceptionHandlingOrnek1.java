import java.util.InputMismatchException;
import java.util.Scanner;


public class Ornek1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("�lk say�y� giriniz");
			int sayi1 = sc.nextInt();
			System.out.println("�kinci say�y� giriniz");
			int sayi2 = sc.nextInt();
			
			int sonuc = sayi1+sayi2;
			System.out.println(sonuc);
			
		} catch (InputMismatchException e) {
			//e.printStackTrace();
			System.out.println("Farkl� tip de�erler toplanamaz");
		} catch (ArithmeticException e){
			System.out.println("S�f�ra b�lme hatas�");
		}
		
		

	}

}
