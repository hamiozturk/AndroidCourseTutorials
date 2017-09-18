import java.util.Scanner;


public class DiziOrnek7 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int elemanSayisi = sc.nextInt();
		
		int[] diziInt = new int[elemanSayisi];
		String[] diziStr = new String[elemanSayisi];
		
		String numerik = "0123456789";
		String girilen = "";
		int girilenCount = 0;
		
		for (int i = 0; i < elemanSayisi; i++) {
			
			System.out.println("metin giriniz");
			girilen = sc.next();
			
			for (int j = 0; j < girilen.length(); j++) {
				for (int k = 0; k < numerik.length(); k++) {
					if(girilen.charAt(j) == numerik.charAt(k)){
						girilenCount++;
					}
				}
			}
			
			if(girilenCount == girilen.length()){
				diziInt[i]=Integer.parseInt(girilen);
			}else{
				diziStr[i]=girilen;
			}
			girilenCount = 0;
			
		}
		
		System.out.println("STRÝNG DÝZÝSÝ");
		for (int i = 0; i < diziStr.length; i++) {
			System.out.println(diziStr[i]);
		}
		
		System.out.println("ÝNT DÝZÝSÝ");
		for (int i = 0; i < diziInt.length; i++) {
			System.out.println(diziInt[i]);
		}
		
		
		
		

	}

}
