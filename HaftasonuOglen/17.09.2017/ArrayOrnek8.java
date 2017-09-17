import java.util.Scanner;


public class ArrayOrnek8 {


	public static void main(String[] args) {
		
		// SAYILARI SAYI DÝZÝSÝNE ATAMA
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaç eleman girilecek");
		int elemanSayisi = scanner.nextInt();
		
		String[] dizi = new String[elemanSayisi];
		int sayiDizi[] = new int[elemanSayisi];
		String sayi = "0123456789";
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i]=scanner.next();
		}
		
		int flag2 = 0;
		
		for (int i = 0; i < sayiDizi.length; i++) {
			int flag = 0;
			for (int j = 0; j < dizi[i].length(); j++) {
				for (int k = 0; k < sayi.length(); k++) {
					if(dizi[i].charAt(j)==sayi.charAt(k)){
						flag++;
					}
				}
				
				if(dizi[i].length() == flag){
					sayiDizi[flag2] = Integer.parseInt(dizi[i]);
					flag2++;
				}
			}
		}
		
		for (int i = 0; i < sayiDizi.length; i++) {
			System.out.println(sayiDizi[i]);
		}
		
		
		
		
	

	}

}
