import java.util.Scanner;


public class Baslat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Yaprak sayýsý giriniz");
		int yaprakSayisi = sc.nextInt();
		
		System.out.println("Renk giriniz");
		String renk = sc.next();
		
		System.out.println("Kokulu mu (e/h)");
		String koku = sc.next();
		boolean kokuluMu;
		
		if(koku.toLowerCase().charAt(0)=='e'){
			kokuluMu = true;
		}else{
			kokuluMu = false;
		}
		
		System.out.println("Dikeni var mý (e/h)");
		String diken = sc.next();
		boolean dikeniVarMi;
		
		if(diken.toLowerCase().charAt(0)=='e'){
			dikeniVarMi = true;
		}else{
			dikeniVarMi = false;
		}
		
		System.out.println("Türünü giriniz");
		String tur = sc.next();
		
		Cicek cicek = new Cicek(yaprakSayisi,renk,kokuluMu,dikeniVarMi,tur);
		cicek.detaylariYazdir();

	}

}
