import java.util.Scanner;


public class ArrayOrnek5 {

	
	public static void main(String[] args) {
		
		
		/*
		ÖRNEK 1 -
		
		DIÞARIDAN 5 ADET KELÝME GÝR
		KELÝME ÝÇERÝSÝNDE A VEYA E KARAKTERLERÝ BULUNMASI DURUMUNDA
		A VE E KARAKTERLERÝNÝ KELÝMEDEN KALDIR
		O KELÝMEYÝ DÝZÝYE EKLE
		DÝZÝYÝ YAZDIR
		 */
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kaç kelime girilecek ?");
		int sayi = sc.nextInt();
		
		String[] dizi = new String[sayi];
		String kelime = "";
		String geciciMetin = "";
		
		for (int i = 0; i < sayi; i++) {
			System.out.println("Kelime giriniz");
			kelime = sc.next().toLowerCase();
			
			for (int j = 0; j < kelime.length(); j++) {
				if(kelime.charAt(j)!='a' && kelime.charAt(j)!='e'){
					geciciMetin = geciciMetin + kelime.charAt(j);
				}
			}
			dizi[i] = geciciMetin;
			geciciMetin = "";
		}
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
		
		
		
		
		
		
		
		

	}

}
