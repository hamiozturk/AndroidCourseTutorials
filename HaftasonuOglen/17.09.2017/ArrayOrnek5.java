import java.util.Scanner;


public class ArrayOrnek5 {

	
	public static void main(String[] args) {
		
		
		/*
		�RNEK 1 -
		
		DI�ARIDAN 5 ADET KEL�ME G�R
		KEL�ME ��ER�S�NDE A VEYA E KARAKTERLER� BULUNMASI DURUMUNDA
		A VE E KARAKTERLER�N� KEL�MEDEN KALDIR
		O KEL�MEY� D�Z�YE EKLE
		D�Z�Y� YAZDIR
		 */
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ka� kelime girilecek ?");
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
