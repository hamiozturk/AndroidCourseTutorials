import java.util.Scanner;


public class MetotOrnek7 {

	
	public boolean kullaniciAdiVeSifreDoluMu(String kullaniciAdi,String sifre){
		boolean durum = false;
		if(kullaniciAdi.isEmpty() || sifre.isEmpty()){
			durum =false;
		}else if(!kullaniciAdi.isEmpty() && !sifre.isEmpty()){
			durum = true;
		}
		return durum;
	}
	
	public static void main(String[] args) {
		Ornek7 o = new Ornek7();

		if(o.kullaniciAdiVeSifreDoluMu("�erif", "fdfgd")==false){
			System.out.println("Kullan�c� ad� veya �ifre bo� b�rak�lm��");
		}else{
			System.out.println("Kullan�c� ad� ve �ifre doludur");
		}
	}

}
