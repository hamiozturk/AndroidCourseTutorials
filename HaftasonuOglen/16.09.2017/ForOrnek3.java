import java.util.Scanner;


public class Ornek3 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç defa sayý isteyeceksiniz ?");
		
		int n = sc.nextInt();
		int cift = 0;
		int tek = 0;
		int geciciSayi = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Sayý giriniz");
			geciciSayi = sc.nextInt();
			if(geciciSayi%2==0){
				cift+=geciciSayi;
			}else{
				tek+=geciciSayi;
			}
		}
		
		System.out.println("Teklerin toplamý:"+tek+" "+"Çiftlerin toplamý:"+cift);
		
		

	}

}
