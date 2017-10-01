
public abstract class Isci {
	
	private double maas;
	private int calismaSaati;
		
	public Isci(){
		
	}
	
	public Isci(double maas, int calismaSaati){
		this.maas = maas;
		this.calismaSaati = calismaSaati;
	}
	
	
	
	public abstract void getKisiDetaylari();
	/*
	 * Bir abstract metot olu�turarak metot body k�sm� (scope) yazmadan olu�turulur.
	 * 
	 * Farkl� bir s�n�f, bu s�n�fta abstract metot oldu�u i�in
	 * implement etmek zorunda b�rak�l�r. yani hangi s�n�f bu s�n�f� extends edecek ise
	 * �rne�in: getKisiDetaylar� metodunu olu�turmaya mecbur b�rak�l�r.
	 * 
	 */
	
	
	

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public int getCalismaSaati() {
		return calismaSaati;
	}

	public void setCalismaSaati(int calismaSaati) {
		this.calismaSaati = calismaSaati;
	}

}
