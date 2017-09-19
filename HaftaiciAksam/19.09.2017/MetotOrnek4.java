import java.util.Random;
import java.util.Scanner;


public class MetotOrnek4 {

	public int sayiUret(int uzunluk){
		Random rnd = new Random();
		return rnd.nextInt(uzunluk);
	}
	
	public static void main(String[] args) {
		int sayiTut = 0;
		
		MetotOrnek4 mO = new MetotOrnek4();
		sayiTut = mO.sayiUret(5);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen sayý giriniz");
		
		int girilenSayi = sc.nextInt();
		
		if (girilenSayi==sayiTut) {
			System.out.println("Tebrikler\nKazandýnýz...~~~");
		}else if(girilenSayi>sayiTut){
			System.out.println("Büyük deðer girdiniz. Sayý "+sayiTut+" idi");
		}else if(girilenSayi<sayiTut){
			System.out.println("Küçük deðer girdiniz. Sayý "+sayiTut+" idi");
		}
	}

}
