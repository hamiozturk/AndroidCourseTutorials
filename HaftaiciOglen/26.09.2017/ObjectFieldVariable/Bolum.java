import java.util.Arrays;


public class Bolum {
	
	String ad;
	Ogretmen[] ogretmenler;
	Ogrenci[] ogrenciler;
	DersProgrami dersprogrami;
	Ders[] dersler;
	
	public Bolum(){
		
	}

	public String toString() {
		return "Bolum [ad=" + ad + ", ogretmenler="
				+ (ogretmenler != null ? Arrays.asList(ogretmenler) : null)
				+ ", ogrenciler="
				+ (ogrenciler != null ? Arrays.asList(ogrenciler) : null)
				+ ", dersprogrami=" + dersprogrami + ", dersler="
				+ (dersler != null ? Arrays.asList(dersler) : null) + "]";
	}

}
