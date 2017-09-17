import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandlingOrnek1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("1.sayýyý giriniz");
			int sayi1 = sc.nextInt();
			System.out.println("2.sayýyý giriniz");
			int sayi2 = sc.nextInt();
			
			int sonuc = sayi1/sayi2;
			System.out.println(sonuc);
			
		} catch (InputMismatchException | ArithmeticException ex) {
			System.out.println("Farklý deðerler toplanamaz.");
		}/*catch (ArithmeticException e){
			System.out.println("Sýfýra bölme hatasý");
		}*/ finally{
			
		}
		

	}

}
