import java.util.Scanner;


public class Baslangic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Kare kare = new Kare();
		Scanner sc = new Scanner(System.in);
		System.out.println("Kenar uzunluðu giriniz");
		kare.setKenar(sc.nextInt());
		
		System.out.println("Karenin Alaný: "+kare.getAlan());
		System.out.println("Karenin Çevresi: "+kare.getCevre());

	}

}
