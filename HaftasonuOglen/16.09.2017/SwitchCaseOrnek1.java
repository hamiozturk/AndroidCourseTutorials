import java.util.Scanner;


public class SwitchCaseOrnek1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1-7 arasý sayý giriniz");
		int gun = sc.nextInt();
		
		switch (gun) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salý");
			break;
		case 3:
			System.out.println("Çarþamba");
			break;
		case 4:
			System.out.println("Perþembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("HATA");
			break;
		}
		
		
		
		
		/*
		System.out.println("Günün ismini giriniz");
		String gun = sc.next();
		
		switch(gun){
			case "pazartesi":
				System.out.println("1.gün");
				break;
			case "salý":
				System.out.println("2.gün");
				break;
			case "çarþamba":
				System.out.println("3.gün");
				break;
			case "perþembe":
				System.out.println("4.gün");
				break;
			case "cuma":
				System.out.println("5.gün");
				break;
			case "cumartesi":
				System.out.println("6.gün");
				break;
			case "pazar":
				System.out.println("7.gün");
				break;
			default:
				System.out.println("Böyle bir gün yok");
				break;
		}
		*/
	

	}

}
