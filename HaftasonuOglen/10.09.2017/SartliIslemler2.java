import java.util.Scanner;



public class SartliIslemler2 {

	public static void main(String[] args) {

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
