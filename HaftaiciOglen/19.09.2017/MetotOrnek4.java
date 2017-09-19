import java.util.Scanner;


public class MetotOrnek4 {

	public void buyukKucukYaz(String metin){
		String geciciMetin = "";
		char c;
		for (int i = 0; i < metin.length(); i++) {
			if(i%2==0){
				c = metin.charAt(i);
				geciciMetin = geciciMetin + String.valueOf(c).toLowerCase();
			}else{
				c = metin.charAt(i);
				geciciMetin = geciciMetin + String.valueOf(c).toUpperCase();
			}
		}
		System.out.println(geciciMetin);
	}

	public static void main(String[] args) {
		Ornek4 o = new Ornek4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç adet metin girilecek ?");
		int sayi = sc.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			o.buyukKucukYaz(sc.next());
		}		
	}

}
