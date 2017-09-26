import java.util.Arrays;


public class Ogrenci {
	
	int ogrenciNo;
	String ad;
	String soyad;
	int girisYili;
	Ders[] ders;
	String bolum;
	
	public Ogrenci(){}
	
	public String toString() {
		return "Ogrenci [ogrenciNo=" + ogrenciNo + ", ad=" + ad + ", soyad="
				+ soyad + ", girisYili=" + girisYili + ", ders="
				+ (ders != null ? Arrays.asList(ders) : null) + ", bolum="
				+ bolum + "]";
	}

}
