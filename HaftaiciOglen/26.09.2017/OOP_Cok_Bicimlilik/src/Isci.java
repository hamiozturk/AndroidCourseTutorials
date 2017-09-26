
public class Isci {
	
	private String isim;
	private String adres;
	private int yas;
	
	public Isci(String isim, String adres, int yas) {
		System.out.println("���i s�n�f� constructor'�");
		this.isim = isim;
		this.adres = adres;
		this.yas = yas;
	}
	
	public void mesajYaz(){
		System.out.println(this.isim + " taraf�ndan iletildi");
	}
	
	public String toString(){
		return isim +" " + adres + " " + yas;
	}
	
	public String getIsim(){
		return isim;
	}
	
	public String getAdres(){
		return adres;
	}
	
	public void setYas(int yas){
		this.yas = yas;
	}
	public int getYas(){
		return yas;
	}
	

}
