import java.util.Scanner;


public class Baslat {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Karenin bir kenar�n�n uzunlu�unu giriniz;");
		int kenarUzunlugu = sc.nextInt();
		Kare kare = new Kare(kenarUzunlugu);
		
		System.out.println("Karenin Kenar Uzunlu�u: "+kare.getKenarUzunlugu());
		System.out.println("Karenin Alan�: "+kare.getAlan());
		System.out.println("Karenin �evresi: "+kare.getCevre());
		
		//kare.setKenarUzunlugu(kenarUzunlugu);
		
	}

}
