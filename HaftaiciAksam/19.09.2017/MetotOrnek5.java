import java.util.Scanner;


public class MetotOrnek5 {

	public static void sayilariOku(int ilkSayi, int sonSayi){
		int i;
		int temp;
		if(sonSayi<ilkSayi){
			temp = sonSayi;
			sonSayi = ilkSayi;
			ilkSayi = temp;
		}
		for(i=ilkSayi+1; i<sonSayi; i++){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ýlk sayýyý giriniz");
		int sayi1 = sc.nextInt();
		System.out.println("Ýkinci sayýyý giriniz");
		int sayi2 = sc.nextInt();
		sayilariOku(sayi1,sayi2);
	}

}
