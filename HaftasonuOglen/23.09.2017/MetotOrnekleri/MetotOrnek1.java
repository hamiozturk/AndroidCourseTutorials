
public class MetotOrnek1 {


	public void metotAdi(){
		System.out.println("METOT �ALI�TI !");
	}
	
	
	public String isimYaz(String ad,String soyad){
		String adSoyad = ad+" - "+soyad;
		return adSoyad;
	}
	
	public static void main(String[] args) {
		
		MetotOrnek1 nesne = new MetotOrnek1();
		
		String sonuc = nesne.isimYaz("�erif","g�ng�r");
		System.out.println(sonuc);
		
	}

}
