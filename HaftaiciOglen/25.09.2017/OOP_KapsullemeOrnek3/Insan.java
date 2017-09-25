public class Insan {
	// GLOBAL FIELD AREA - de�i�ken alan�
	private int yas; // de�i�ken/field
	private int boy;
	private int kilo;
	private String isim;
	private char cinsiyet; // E -> BAY   K -> BAYAN
	private boolean evliMi;
	
	public Insan(){
		//BO� CONSTRUCTOR
	}
	public Insan(int yas,int boy,int kilo,String isim,char cinsiyet,boolean evliMi){
		this.yas = yas;
		this.boy = boy;
		this.kilo = kilo;
		this.isim = isim;
		this.cinsiyet = cinsiyet;
	}
	
	public void getTumKisiDetaylari(){
		System.out.println("�sim: "+isim);
		System.out.println("Ya�: "+yas);
		System.out.println("Boy: "+boy);
		System.out.println("Kilo: "+kilo);
		
		if(cinsiyet=='E'){
			System.out.println("Cinsiyet: Erkek");
		}else if(cinsiyet=='K'){
			System.out.println("Cinsiyet: Kad�n");
		}
		
		if(evliMi==true){
			System.out.println("Medeni durumu: Evli");
		}else{
			System.out.println("Medeni durumu: Bekar");
		}
		
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public int getBoy() {
		return boy;
	}
	public void setBoy(int boy) {
		this.boy = boy;
	}
	public int getKilo() {
		return kilo;
	}
	public void setKilo(int kilo) {
		this.kilo = kilo;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public char getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(char cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public boolean isEvliMi() {
		return evliMi;
	}
	public void setEvliMi(boolean evliMi) {
		this.evliMi = evliMi;
	}
	

}
