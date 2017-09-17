import java.util.Scanner;


public class ArrayOrnek2 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eleman sayýsý giriniz");
		int elemanSayisi = sc.nextInt();
		
		int[] dizi = new int[elemanSayisi];
		int toplam = 0;
		
		for (int i = 0; i < elemanSayisi; i++) {
			System.out.println((i+1)+". elemaný giriniz");
			dizi[i] = sc.nextInt();
			toplam += dizi[i];
		}
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
		System.out.println("\n---\nToplam: "+toplam);

	}

}
