import java.util.Scanner;


public class Ornek4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String rakamlar = "0123456789";
		int sayac = 0;
		
		for (int i = 0; i < str.length(); i++) {
			// her bir karakteri dönecek
			for (int j = 0; j < rakamlar.length(); j++) {
				// i.karakter sayý mý ?
				if(rakamlar.charAt(j) == str.charAt(i)){
					sayac++;
				}
			}
		}
		System.out.println(sayac);
		

	}

}
