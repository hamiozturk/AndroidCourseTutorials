import java.util.Scanner;



public class LoginOrnegi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Kullan�c� ad� giriniz");
		String uname = sc.next();
		System.out.println("Kullan�c� �ifre giriniz");
		String upw = sc.next();
		
		if("ADM�N".equals(uname)){
			System.out.println("Ho� geldin patron !");
		}else{
			System.out.println("Sen kimsin ?");
			String name = sc.next();
			System.out.println("Seni tan�m�yorum, "+name);
		}

	}

}
