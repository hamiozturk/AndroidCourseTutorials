import java.util.Scanner;


public class DiziOrnek5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç adet kelime girilecek ?");
		int kelimeSayisi = sc.nextInt();
		
		String[] diziA = new String[kelimeSayisi];
		String[] diziK = new String[kelimeSayisi];
		
		for (int i = 0; i < kelimeSayisi; i++) {
			String girilenMetin = sc.next();
			
			if(girilenMetin.charAt(0) == 'A' || girilenMetin.charAt(0) == 'a'){
				diziA[i] = girilenMetin;
			}else if(girilenMetin.charAt(0) == 'K' || girilenMetin.charAt(0) == 'k'){
				diziK[i] = girilenMetin;
			}
		}
		
		System.out.println("A DÝZÝSÝ");
		for (int i = 0; i < diziA.length; i++) {
			if(diziA[i]!=null){
				System.out.println(diziA[i]);
			}
		}
		
		System.out.println("K DÝZÝSÝ");
		for (int i = 0; i < diziK.length; i++) {
			if(diziK[i]!=null){
				System.out.println(diziK[i]);
			}
		}
		

	}

}
