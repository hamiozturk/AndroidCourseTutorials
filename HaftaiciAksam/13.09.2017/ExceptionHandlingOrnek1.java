import java.util.InputMismatchException;
import java.util.Scanner;


public class Ornek1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Ýlk sayýyý giriniz");
			int sayi1 = sc.nextInt();
			System.out.println("Ýkinci sayýyý giriniz");
			int sayi2 = sc.nextInt();
			
			int sonuc = sayi1+sayi2;
			System.out.println(sonuc);
			
		} catch (InputMismatchException e) {
			//e.printStackTrace();
			System.out.println("Farklý tip deðerler toplanamaz");
		} catch (ArithmeticException e){
			System.out.println("Sýfýra bölme hatasý");
		}
		
		

	}

}
