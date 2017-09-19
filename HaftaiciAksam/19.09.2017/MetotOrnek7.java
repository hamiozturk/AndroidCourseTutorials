import java.util.Scanner;


public class MetotOrnek7 {

	
	public int say(int[] dizi){
		int flag=0;
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i]>=0){
				flag++;
			}
		}
		return flag;
	}
	
	public int[] getCharIndex(String yazi, String aranacak){
		char ch = aranacak.charAt(0);
		int dizi[] = new int[yazi.length()];
		
		for (int i = 0; i < yazi.length(); i++) {
			if(yazi.charAt(i)==ch){
				dizi[i] = i;
			}else{
				dizi[i] = -1;
			}
		}
		int sayi = say(dizi);
		int[] dizi2 = new int[sayi];
		for (int i = 0; i < dizi.length; i++) {
			int flag=0;
			if(dizi[i]!=-1){
				dizi2[flag] = dizi[i];
				flag++;
			}
		}
		return dizi2;
	}
	
	public static void main(String[] args) {
		System.out.println("Lütfen yazý giriniz");
		Scanner sc = new Scanner(System.in);
		String yazi = sc.next();
		System.out.println("Karakter giriniz");
		String aranacak = sc.next(); // tek karakter giriniz
		MetotOrnek7 mO = new MetotOrnek7();
		
		int[] dizi = mO.getCharIndex(yazi, aranacak);
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}

	}

}
