
public class Araba {
	
	private String renk;
	private int uretimYili;
	private String marka;
	private String model;
	private int enFazlaHiz;
	
	public void tumDetaylariYazdir(){
		System.out.println("Renk: "+renk);
		System.out.println("�retim y�l�: "+uretimYili);
		System.out.println("Marka: "+marka);
		System.out.println("Model: "+model);
		System.out.println("En fazla h�z: "+enFazlaHiz);
	}
	
	
	public Araba(){
		// Bo� Constructor
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
	 * KAPS�LLEMEN�N �LKELER�
	 * 
	 * 1. �LKE
	 * Global fieldlar olu�turulur. Fieldlar�n eri�im seviyesi private olmal�d�r.
	 * 
	 * 2. �LKE
	 * Her class i�in Bo� ve Dolu Constructor olu�turaca��z.
	 * Constructorlar Class isimleriyle birebir ayn� olmak zorundad�r.
	 * 
	 * 3. �LKE
	 * Her bir olu�turulan field (de�i�ken) i�in getter ve setter metot yazmal�s�n�z.
	 * 
	 * 
	 */
	
	
	

}
