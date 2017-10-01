
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
	 * Bir abstract metot oluþturarak metot body kýsmý (scope) yazmadan oluþturulur.
	 * 
	 * Farklý bir sýnýf, bu sýnýfta abstract metot olduðu için
	 * implement etmek zorunda býrakýlýr. yani hangi sýnýf bu sýnýfý extends edecek ise
	 * örneðin: getKisiDetaylarý metodunu oluþturmaya mecbur býrakýlýr.
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
