import java.util.Scanner;


public class Ornek5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eleman sayýsý giriniz");
		int elemanSayisi = sc.nextInt();		
		String[] aDizisi = new String[elemanSayisi];
		String[] eDizisi = new String[elemanSayisi];
		
		for (int i = 0; i < elemanSayisi; i++) {
			
			String girilenMetin = sc.next();
			
			if(girilenMetin.charAt(0) == 'A' || girilenMetin.charAt(0) == 'a'){
				aDizisi[i] = girilenMetin;
			}else if(girilenMetin.charAt(0) == 'E' || girilenMetin.charAt(0) == 'e'){
				eDizisi[i] = girilenMetin;
			}
			
		}
		
		System.out.println("A DÝZÝSÝ");
		for (int i = 0; i < aDizisi.length; i++) {
			System.out.println(aDizisi[i]);
		}
		
		System.out.println("E DÝZÝSÝ");
		for (int i = 0; i < eDizisi.length; i++) {
			System.out.println(eDizisi[i]);
		}
		

	}

}
