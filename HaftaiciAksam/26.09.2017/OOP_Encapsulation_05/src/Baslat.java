import java.util.Scanner;


public class Baslat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Kýsa kenarý giriniz");
		int kisaKenar = sc.nextInt();
		System.out.println("Uzun kenarý giriniz");
		int uzunKenar = sc.nextInt();
	
		//Dikdortgen dikdortgen = new Dikdortgen(kisaKenar,uzunKenar);
		
		Dikdortgen dikdortgen = new Dikdortgen();
		dikdortgen.setKisaKenar(kisaKenar);
		dikdortgen.setUzunKenar(uzunKenar);
		
		System.out.println("Alaný: "+dikdortgen.getAlan());
		System.out.println("Çevresi: "+dikdortgen.getCevre());


	}

}
