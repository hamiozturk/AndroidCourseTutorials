
public class Araba {
	
	private String renk;
	private int uretimYili;
	private String marka;
	private String model;
	private int enFazlaHiz;
	
	public void tumDetaylariYazdir(){
		System.out.println("Renk: "+renk);
		System.out.println("Üretim yýlý: "+uretimYili);
		System.out.println("Marka: "+marka);
		System.out.println("Model: "+model);
		System.out.println("En fazla hýz: "+enFazlaHiz);
	}
	
	
	public Araba(){
		// Boþ Constructor
	}	
	
	public Araba(String renk, int uretimYili, String marka, String model,
			int enFazlaHiz) {
		this.renk = renk;
		this.uretimYili = uretimYili;
		this.marka = marka;
		this.model = model;
		this.enFazlaHiz = enFazlaHiz;
	}

	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getUretimYili() {
		return uretimYili;
	}
	public void setUretimYili(int uretimYili) {
		this.uretimYili = uretimYili;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getEnFazlaHiz() {
		return enFazlaHiz;
	}
	public void setEnFazlaHiz(int enFazlaHiz) {
		this.enFazlaHiz = enFazlaHiz;
	}
	
	
	
	/*
	 * KAPSÜLLEMENÝN ÝLKELERÝ
	 * 
	 * 1. ÝLKE
	 * Global fieldlar oluþturulur. Fieldlarýn eriþim seviyesi private olmalýdýr.
	 * 
	 * 2. ÝLKE
	 * Her class için Boþ ve Dolu Constructor oluþturacaðýz.
	 * Constructorlar Class isimleriyle birebir ayný olmak zorundadýr.
	 * 
	 * 3. ÝLKE
	 * Her bir oluþturulan field (deðiþken) için getter ve setter metot yazmalýsýnýz.
	 * 
	 * 
	 */
	
	
	

}
