import java.util.Arrays;


public class Ders {
	
	String ad;
	int kredi;
	String Ogretmen;
	int saat;
	int not;
	Ogrenci[] ogrenciler;
	
	public Ders(){}

	public String toString() {
		return "Ders [ad=" + ad + ", kredi=" + kredi + ", Ogretmen=" + Ogretmen
				+ ", saat=" + saat + ", not=" + not + ", ogrenciler="
				+ (ogrenciler != null ? Arrays.asList(ogrenciler) : null) + "]";
	}


}
