import java.util.Scanner;


public class SwitchCaseOrnek2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String mevsim = sc.next();
		
		switch (mevsim) {
			case "sonbahar":
				System.out.println("sonbahar");
				break;
			case "kýþ":
				System.out.println("kýþ");
				break;
			case "ilkbahar":
				System.out.println("ilkbahar");
				break;
			case "yaz":
				System.out.println("yaz");
				break;
			default:
				System.out.println("HATALI GÝRÝÞ");
				break;
		}
		
	

	}

}
