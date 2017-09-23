
public class MetotOrnek5 {
	
	public int unluSayisiniBul(String metin){
		
		char[] dizi = new char[metin.length()];
		int sayac = 0;
		
		for (int i = 0; i < metin.length(); i++) {
			dizi[i] = metin.charAt(i);
		}
		
		String unlu = "aeýioöuü";
		
		for (int i = 0; i < metin.length(); i++) { //metin uzunluðu kadar dön
			for (int j = 0; j < unlu.length(); j++) { //unlu deðiþkeni uzunluðu kadar
				if(dizi[i]==unlu.charAt(j)){
					sayac++;
				}
			}
			
		}
		
		return sayac;
	}

	
	public static void main(String[] args) {
		
		MetotOrnek5 o = new MetotOrnek5();
		int sayi = o.unluSayisiniBul("merhaba");
		System.out.println(sayi);
		
	}

}
