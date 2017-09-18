
public class DiziOrnek6 {

	public static void main(String[] args) {
		
		String[] dizi = new String[5];
		dizi[0] = "MERHABA";
		dizi[1] = "JAVA";
		dizi[2] = "ANDROÝD";
		dizi[3] = null;
		dizi[4] = "MOBÝL PROGRAMLAMA";
		
		int elemanSayisi = dizi.length;
		int doluElemanSayisi = 0;
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
			if(dizi[i]!=null){
				doluElemanSayisi++;
			}
		}
		
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i]!=null){
				System.out.println(dizi[i]);
			}
		}
		
		System.out.println((elemanSayisi-doluElemanSayisi) + " adet null var");
		
		
		

	}

}
