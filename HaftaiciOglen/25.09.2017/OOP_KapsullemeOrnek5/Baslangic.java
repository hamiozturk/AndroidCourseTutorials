import java.util.Scanner;


public class Baslangic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Kare kare = new Kare();
		Scanner sc = new Scanner(System.in);
		System.out.println("Kenar uzunlu�u giriniz");
		kare.setKenar(sc.nextInt());
		
		System.out.println("Karenin Alan�: "+kare.getAlan());
		System.out.println("Karenin �evresi: "+kare.getCevre());

	}

}
