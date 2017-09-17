import java.util.Scanner;


public class Ornek4 {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Lütfen metin giriniz");
		String metin = s.nextLine();
		
		String geciciMetin = "";
		
		
		for (int i = 0; i < metin.length(); i++) {

			if(i%2==0){
				geciciMetin = geciciMetin + String.valueOf(metin.charAt(i)).toUpperCase();
			}else{
				geciciMetin = geciciMetin + String.valueOf(metin.charAt(i)).toLowerCase();
			}
			
		}
		
		System.out.println(geciciMetin);

	}

}
