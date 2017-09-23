
public class MetotOrnek2 {

	public double topla(double sayi1,double sayi2){
		double sonuc = sayi1+sayi2;
		return sonuc;
	}
	
	public double cikar(double sayi1,double sayi2){
		double sonuc = sayi1-sayi2;
		return sonuc;
	}
	
	public double carp(double sayi1,double sayi2){
		double carp = sayi1*sayi2;
		return carp;	
	}
	public int bol(int sayi1,int sayi2){
		int bol = sayi1/sayi2;
		return bol;
	}

	public static void main(String[] args) {
		
		MetotOrnek2 ornek = new MetotOrnek2();
		double toplamaSonucu = ornek.topla(10, 20);
		double cikarmaSonucu = ornek.cikar(20, 10);
		double carpmaSonucu = ornek.carp(15.7, 2);
		int bolmeSonucu = ornek.bol(50, 5);
		
		System.out.println("Toplama Sonucu: "+toplamaSonucu);
		System.out.println("Çýkarma Sonucu: "+cikarmaSonucu);
		System.out.println("Çarpma Sonucu: "+carpmaSonucu);
		System.out.println("Bölme Sonucu: "+bolmeSonucu);

	}

}
