import java.util.Scanner;


public class SwitchCaseOrnek1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1-7 aras� say� giriniz");
		int gun = sc.nextInt();
		
		switch (gun) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("Per�embe");
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
		System.out.println("G�n�n ismini giriniz");
		String gun = sc.next();
		
		switch(gun){
			case "pazartesi":
				System.out.println("1.g�n");
				break;
			case "sal�":
				System.out.println("2.g�n");
				break;
			case "�ar�amba":
				System.out.println("3.g�n");
				break;
			case "per�embe":
				System.out.println("4.g�n");
				break;
			case "cuma":
				System.out.println("5.g�n");
				break;
			case "cumartesi":
				System.out.println("6.g�n");
				break;
			case "pazar":
				System.out.println("7.g�n");
				break;
			default:
				System.out.println("B�yle bir g�n yok");
				break;
		}
		*/
	

	}

}
