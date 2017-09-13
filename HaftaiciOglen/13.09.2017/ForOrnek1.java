import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kaç tane kelime gireceksiniz");
		int girilecekKelimeSayisi = sc.nextInt();		
		String geciciMetin = "";	
		char geciciKarakter;		
		
		
		for(int i = 0; i<girilecekKelimeSayisi; i++){
			System.out.println(i+" kelimeyi giriniz");
			geciciKarakter = sc.next().charAt(0);
			geciciMetin = geciciMetin + geciciKarakter;			
		}
		
		System.out.println(geciciMetin);
	
	}

}
