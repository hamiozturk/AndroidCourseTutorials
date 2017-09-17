
public class ArrayOrnek1 {

	public static void main(String[] args) {
		
		// Array (Dizi)
		
		String[] derslerDizisi = new String[10];
		int[] intDizi = new int[5];
		
		int diziElemanSayisi = derslerDizisi.length;
		
		
		derslerDizisi[0] = "ANDROÝD";
		derslerDizisi[1] = "iOS";
		derslerDizisi[2] = "PHP";
		derslerDizisi[3] = "C#";
		derslerDizisi[4] = "Swift";
		derslerDizisi[5] = "JAVA";
		
		
		for (int i = 0; i < derslerDizisi.length; i++) {
			System.out.println(derslerDizisi[i]);
		}
		
		
		intDizi[2] = 3;
		for (int i = 0; i < intDizi.length; i++) {
			System.out.println(intDizi[i]);
		}
		
		

	}
	
	
	

}
