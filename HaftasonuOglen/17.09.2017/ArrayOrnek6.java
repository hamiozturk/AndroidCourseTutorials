import java.util.Scanner;


public class ArrayOrnek6 {


	public static void main(String[] args) {
		/*
		 
		 �RNEK 2 -
		 
		 DI�ARIDAN D�Z�YE N ADET KEL�ME G�R
		 
		 DI�ARIDAN G�RECE��M�Z �ND�S DE�ER�NE G�RE O �ND�S ��ER�S�N� BO�ALT
		 
		 D�Z�N�N EKRANDA SON HAL�N� G�STER
		 
		 KA� ADET D�Z�DE DOLU ELEMAN VAR SAYISINI YAZDIR
		 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ka� adet kelime girilecek");
		int uzunluk = sc.nextInt();
		
		String[] dizi = new String[uzunluk];
		int doluDegerSayisi = 0;
		
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println("Kelime giriniz");
			dizi[i] = sc.next();
		}
		
		System.out.println("Ka��nc� indis i�eri�i bo�alt�ls�n ?");		
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
		
		System.out.println(doluDegerSayisi+" adet dolu eleman vard�r");
		System.out.println((uzunluk-doluDegerSayisi)+" adet null var");
		
		
		

	}

}
