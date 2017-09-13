import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Lütfen mevsim giriniz");
		String mevsim = sc.next();		
		
		switch (mevsim) {
		case "sonbahar":
			System.out.println("Sonbahar aylarý");
			break;
		case "kýþ":
			System.out.println("Kýþ aylarý");
			break;
		case "ilkbahar":
			System.out.println("Ýlkbahar aylarý");
			break;
		case "yaz":
			System.out.println("Yaz aylarý");
			break;
		default:
			System.out.println("Böyle bir mevsim yok");
			break;
		}
		

	}

}
