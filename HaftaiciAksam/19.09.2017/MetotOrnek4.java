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
		System.out.println("L�tfen say� giriniz");
		
		int girilenSayi = sc.nextInt();
		
		if (girilenSayi==sayiTut) {
			System.out.println("Tebrikler\nKazand�n�z...~~~");
		}else if(girilenSayi>sayiTut){
			System.out.println("B�y�k de�er girdiniz. Say� "+sayiTut+" idi");
		}else if(girilenSayi<sayiTut){
			System.out.println("K���k de�er girdiniz. Say� "+sayiTut+" idi");
		}
	}

}
