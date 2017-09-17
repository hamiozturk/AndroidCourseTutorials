import java.util.Scanner;


public class ArrayOrnek6 {


	public static void main(String[] args) {
		/*
		 
		 ÖRNEK 2 -
		 
		 DIÞARIDAN DÝZÝYE N ADET KELÝME GÝR
		 
		 DIÞARIDAN GÝRECEÐÝMÝZ ÝNDÝS DEÐERÝNE GÖRE O ÝNDÝS ÝÇERÝSÝNÝ BOÞALT
		 
		 DÝZÝNÝN EKRANDA SON HALÝNÝ GÖSTER
		 
		 KAÇ ADET DÝZÝDE DOLU ELEMAN VAR SAYISINI YAZDIR
		 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kaç adet kelime girilecek");
		int uzunluk = sc.nextInt();
		
		String[] dizi = new String[uzunluk];
		int doluDegerSayisi = 0;
		
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println("Kelime giriniz");
			dizi[i] = sc.next();
		}
		
		System.out.println("Kaçýncý indis içeriði boþaltýlsýn ?");		
		int indis = sc.nextInt();
		
		for (int i = 0; i < dizi.length; i++) {
			if(i==indis){
				dizi[i]=null;
			}
		}		
		System.out.println("---");		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
			if(dizi[i]!=null){
				doluDegerSayisi++;
			}
		}
		
		System.out.println(doluDegerSayisi+" adet dolu eleman vardýr");
		System.out.println((uzunluk-doluDegerSayisi)+" adet null var");
		
		
		

	}

}
