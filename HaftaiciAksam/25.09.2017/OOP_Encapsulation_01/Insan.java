public class Insan {
	
	private int yas;
	private String isim;
	private String cinsiyet;
	
	public Insan(){
		//BOÞ CONSTRUCTOR
	}
	
	public Insan(int yas, String isim, String cinsiyet) {
		this.yas = yas;
		this.isim = isim;
		this.cinsiyet = cinsiyet;
	}
	
	public void getKisiDetaylari(){
		System.out.println("Ýsim: "+isim);
		System.out.println("Cinsiyet: "+cinsiyet);
		System.out.println("Yaþ: "+yas);
	}


	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	

	
	// ENCAPSULATÝON (KAPSÜLLEME)
	
	// 1.KISIM
	
	/*
	 * GLOBAL FIELDLARIN TANIMLANMASI (PRIVATE ERÝÞÝM SEVÝYESÝ)
	 * DEGISKENLERIN ISIMLERINI FIELD OLARAK TANIMLAYACAGIZ.
	 */
	
	
	// 2. KISIM
	
	/*
	 * BOÞ VE DOLU CONSTRUCTOR OLUÞTURMAK ZORUNDAYIZ
	 */
	
	// 3. KISIM
	
	/*
	 * HER BIR FIELD ICIN GET VE SET METOTLARI
	 * YAZMAK DURUMUNDA OLACAGIZ.
	 * 
	 */
	

}