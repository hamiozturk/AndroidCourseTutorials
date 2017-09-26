
public class Baslangic {

	public static void main(String[] args) {
		
		
		
			Bolum bolum = new Bolum();
			bolum.ad = "Bilgisayar Mühendisliði";
			
			Ogrenci[] ogrenciler = new Ogrenci[8];
			
			Ogrenci ogrenci = new Ogrenci();
			ogrenci.ad = "";
			ogrenci.soyad = "";
			ogrenci.ogrenciNo = 201701;
			ogrenci.girisYili = 2017;
			ogrenci.bolum = "Bilgisayar Mühendisliði";
			
			Ders[] dersler = new Ders[1];
			Ders ders = new Ders();
			ders.ad = "Android ile Mobil Programlama";
			ders.kredi = 5;
			ders.not = 100;
			ders.Ogretmen = "Þerif GÜNGÖR";
			ders.saat = 6;
			dersler[0]=ders;
			
			ogrenci.ders = dersler;
			System.out.println(ogrenci.ders[0].toString());

	}

}
