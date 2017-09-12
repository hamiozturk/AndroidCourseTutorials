import java.util.Scanner;

public class ForDongusuOrnekleri {

	public static void main(String[] args) {
		
		
		/*
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);			
		}
		*/
		
		/*
		for (int i = 0; i <= 50; i=i+2) {
			System.out.println(i);			
		}
		*/
		
		/*
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Yazý giriniz");
		String yazi = sc.nextLine();
		
		String gecici = "";
		char karakter;
		
		for (int i = 0; i < yazi.length(); i++) {
			if(i%2==0){
				karakter = yazi.charAt(i);
				gecici = gecici + String.valueOf(karakter).toLowerCase();
			}else{
				karakter = yazi.charAt(i);
				gecici = gecici + String.valueOf(karakter).toUpperCase();
			}			
		}
		
		System.out.println(gecici);
		
		*/
		
		/*
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç tane sayý gireceksiniz");
		int sayi = sc.nextInt();
		
		int tekToplam = 0;
		int ciftToplam = 0;
		int geciciSayi = 0;
		
		for(int i = 0; i<sayi; i++){
			System.out.println(i+". sayýyý giriniz;");
			geciciSayi = sc.nextInt();
			
			if(geciciSayi%2==0){
				ciftToplam = ciftToplam + geciciSayi;
			}else{
				tekToplam = tekToplam + geciciSayi;
			}
			
		}
		
		System.out.println("Tek toplamý:"+tekToplam);
		System.out.println("Çift toplamý:"+ciftToplam);
		
		*/
		
		for (int i = 49; i >= 1; i--) {
			i = i -4;
			System.out.println(i);
		}
		

	
	}

}
