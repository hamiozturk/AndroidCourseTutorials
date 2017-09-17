import java.util.Scanner;


public class ArrayOrnek4 {


	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kaç eleman girilecek ?");
		int elemanSayisi = sc.nextInt();
		
		String[] aDizisi = new String[elemanSayisi];
		String[] eDizisi = new String[elemanSayisi];
		String sonGirilen = "";
		
		for (int i = 0; i < elemanSayisi; i++) {
			sonGirilen = sc.next();
			if('A'==sonGirilen.charAt(0) || 'a'==sonGirilen.charAt(0)){
				aDizisi[i] = sonGirilen;
			}else if('E'==sonGirilen.charAt(0) || 'e'==sonGirilen.charAt(0)){
				eDizisi[i] = sonGirilen;
			}
		}
		
		System.out.println("E DÝZÝSÝ");
		for (int i = 0; i < eDizisi.length; i++) {
			if (eDizisi[i]!=null) {
				System.out.println(eDizisi[i] + " i -> "+i);
			}
		}
		
		System.out.println("A DÝZÝSÝ");
		for (int i = 0; i < aDizisi.length; i++) {
			if(aDizisi[i]!=null){
				System.out.println(aDizisi[i] + " i -> "+i);
			}
		}
		
		
		
		

	}
	
	
	

}
