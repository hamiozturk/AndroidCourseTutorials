import java.util.Scanner;


public class Baslat {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Karenin bir kenarýnýn uzunluðunu giriniz;");
		int kenarUzunlugu = sc.nextInt();
		Kare kare = new Kare(kenarUzunlugu);
		
		System.out.println("Karenin Kenar Uzunluðu: "+kare.getKenarUzunlugu());
		System.out.println("Karenin Alaný: "+kare.getAlan());
		System.out.println("Karenin Çevresi: "+kare.getCevre());
		
		//kare.setKenarUzunlugu(kenarUzunlugu);
		
	}

}
