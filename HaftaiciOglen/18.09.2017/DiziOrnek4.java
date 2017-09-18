import java.util.Scanner;


public class DiziOrnek4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç adet kelime girilecek");
		int uzunluk = sc.nextInt();
		
		String[] dizi = new String[uzunluk];
		
		
		for (int i = 0; i < uzunluk; i++) {
			dizi[i] = sc.next();
		}
		
		String yeniMetin = "";
		
		for (int i = 0; i < dizi.length; i++) {
			yeniMetin = yeniMetin + dizi[i].charAt(0);
		}
		
		System.out.println(yeniMetin);

	}

}
