import java.util.Scanner;


public class Ornek4 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç adet sayý gireceksiniz ?");
		int uzunluk = sc.nextInt();
		
		int[] dizi = new int[uzunluk];
		
		for (int i = 0; i < dizi.length; i++) {
			int sayi = sc.nextInt();
			
			if(sayi%2==0){
				dizi[i]=sayi;
			}
		}
		
		int toplam = 0;
		
		for (int i = 0; i < dizi.length; i++) {
			toplam = toplam + dizi[i];
			if(dizi[i]!=0){
				System.out.println(dizi[i]);
			}
		}
		

	}

}
