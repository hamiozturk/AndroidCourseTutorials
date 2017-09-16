import java.util.Scanner;


public class KelimedeSayilarinSayisi {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String rakamlar = "0123456789";
		int sayac = 0;
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < rakamlar.length(); j++) {
				if(str.charAt(i)==rakamlar.charAt(j)){
					sayac++;
				}
			}
		}
		
		System.out.println("Kelimede "+sayac+" adet sayý bulundu");
		

	}

}
