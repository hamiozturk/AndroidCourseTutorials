public class Hayvan {

	// GLOBAL ALAN, FIELDLAR BU ALANDA BULUNUR

	private int yas;
	private String tur;
	private String cinsiyet;

	// BOÞ CONSTRUCTOR
	public Hayvan() {

	}

	// DOLU CONSTRUCTOR
	public Hayvan(int yas, String tur, String cinsiyet) {
		this.yas = yas;
		this.tur = tur;
		this.cinsiyet = cinsiyet;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public void konus() {
		System.out.println("Cinsiyeti: " + getCinsiyet());
		System.out.println("Yaþý: " + getYas());
		System.out.println("Türü: " + getTur());
	}

}