import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("L�tfen mevsim giriniz");
		String mevsim = sc.next();		
		
		switch (mevsim) {
		case "sonbahar":
			System.out.println("Sonbahar aylar�");
			break;
		case "k��":
			System.out.println("K�� aylar�");
			break;
		case "ilkbahar":
			System.out.println("�lkbahar aylar�");
			break;
		case "yaz":
			System.out.println("Yaz aylar�");
			break;
		default:
			System.out.println("B�yle bir mevsim yok");
			break;
		}
		

	}

}
