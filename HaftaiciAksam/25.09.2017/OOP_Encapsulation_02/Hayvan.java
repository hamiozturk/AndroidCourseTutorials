
public class Hayvan {
	private int yas;
	private String tur;
	private String cinsiyet;
	
	public Hayvan(){
		
	}
	public Hayvan(int yas,String tur,String cinsiyet){
		this.yas = yas;
		this.tur = tur;
		this.cinsiyet = cinsiyet;
	}
	
	public void getDetaylar(){
		System.out.println("T�r: "+tur);
		System.out.println("Ya�: "+yas);
		System.out.println("Cinsiyet: "+cinsiyet);
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

}
