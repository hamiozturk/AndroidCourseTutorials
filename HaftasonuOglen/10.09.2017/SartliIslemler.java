import java.util.Scanner;



public class SartliIslemler {

	public static void main(String[] args) {
			
		// �ARTLI ��LEMLER
		 
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
