import java.util.Scanner;



public class SartliIslemler {

	public static void main(String[] args) {
			
		// ÞARTLI ÝÞLEMLER
		 
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
