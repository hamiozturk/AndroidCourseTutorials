import java.util.Scanner;


public class DiziOrnek2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int elemanSayisi = sc.nextInt();
		
		String[] dizi = new String[elemanSayisi];
		
		for (int i = 0; i < elemanSayisi; i++) {
			dizi[i] = sc.next();
		}
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		

	}

}
