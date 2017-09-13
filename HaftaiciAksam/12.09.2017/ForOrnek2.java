import java.util.Scanner;


public class Ornek2 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Metin giriniz");
		String metin = sc.nextLine();
		String geciciMetin = "";
		char c;
		
		for (int i = 0; i < metin.length(); i++) {
			if(i%2==0){
				c = metin.charAt(i);
				geciciMetin = geciciMetin + String.valueOf(c).toLowerCase();
			}else{
				c = metin.charAt(i);
				geciciMetin = geciciMetin + String.valueOf(c).toUpperCase();
			}
		}
		System.out.println(geciciMetin);
		
		

	}

}
