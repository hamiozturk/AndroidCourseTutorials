import java.util.Scanner;



public class SartliIslemler2 {

	public static void main(String[] args) {

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
