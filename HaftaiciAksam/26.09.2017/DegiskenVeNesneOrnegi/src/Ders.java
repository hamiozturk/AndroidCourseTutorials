import java.util.Arrays;


public class Ders {
	String ad;
	int kredi;
	String ogretmen;
	int saat;
	int not;
	Ogrenci[] ogrenciler;
	
	public Ders(){}

	public String toString() {
		return "Ders [ad=" + ad + ", kredi=" + kredi + ", ogretmen=" + ogretmen
				+ ", saat=" + saat + ", not=" + not + ", ogrenciler="
				+ (ogrenciler != null ? Arrays.asList(ogrenciler) : null) + "]";
	}
	
	

}
