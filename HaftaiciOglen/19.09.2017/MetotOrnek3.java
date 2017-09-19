
public class MetotOrnek3 {
	
	public void sayilariDon(int sayi){
		for (int i = 0; i < sayi; i++) {
			System.out.println(i);
		}
	}
	
	public void sayilariDon2(int baslangicSayisi,int bitisSayisi){
		for (int i = baslangicSayisi; i <= bitisSayisi; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
	
		Ornek3 ornek = new Ornek3();
		//ornek.sayilariDon(100);
		ornek.sayilariDon2(100, 500);
		
	}

}
