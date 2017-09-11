import java.util.Scanner;



public class LoginOrnegi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Kullanýcý adý giriniz");
		String uname = sc.next();
		System.out.println("Kullanýcý þifre giriniz");
		String upw = sc.next();
		
		if("ADMÝN".equals(uname)){
			System.out.println("Hoþ geldin patron !");
		}else{
			System.out.println("Sen kimsin ?");
			String name = sc.next();
			System.out.println("Seni tanýmýyorum, "+name);
		}

	}

}
