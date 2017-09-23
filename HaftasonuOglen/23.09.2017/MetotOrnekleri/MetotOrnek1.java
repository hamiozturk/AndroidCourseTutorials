
public class MetotOrnek1 {


	public void metotAdi(){
		System.out.println("METOT ÇALIÞTI !");
	}
	
	
	public String isimYaz(String ad,String soyad){
		String adSoyad = ad+" - "+soyad;
		return adSoyad;
	}
	
	public static void main(String[] args) {
		
		MetotOrnek1 nesne = new MetotOrnek1();
		
		String sonuc = nesne.isimYaz("þerif","güngör");
		System.out.println(sonuc);
		
	}

}
