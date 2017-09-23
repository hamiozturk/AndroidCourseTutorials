import java.util.Scanner;


public class MetotOrnek3 {

	public double hesapla(double sayi1,double sayi2,String islem){
		
		double sonuc = 0;
		
		switch (islem) {
		case "topla":
			sonuc = sayi1+sayi2;
			break;
		case "cikar":
			sonuc = sayi1-sayi2;
			break;
		case "carp":
			sonuc = sayi1*sayi2;
			break;
		case "bol":
			sonuc = sayi1/sayi2;
			break;
		}
		return sonuc;
	}
	
	
	public static void main(String[] args) {
		MetotOrnek3 o = new MetotOrnek3();
		Scanner sc = new Scanner(System.in);
		//double sonuc = o.hesapla(sc.nextDouble(), sc.nextDouble(), sc.next());
		
		System.out.println("Ýþlem giriniz (topla,cikar,carp,bol)");
		String islem = sc.next();
		
		if(
				"topla".equals(islem) || "cikar".equals(islem) ||
				"carp".equals(islem) || "bol".equals(islem)
		){
			System.out.println("1. sayýyý giriniz");
			double sayi1 = sc.nextDouble();
			System.out.println("2. sayýyý giriniz");
			double sayi2 = sc.nextDouble();
			double sonuc = o.hesapla(sayi1, sayi2, islem);
			System.out.println("Ýþlemin sonucu: "+sonuc);
		}else{
			System.out.println("Hatalý iþlem");
		}
		
	}

}
