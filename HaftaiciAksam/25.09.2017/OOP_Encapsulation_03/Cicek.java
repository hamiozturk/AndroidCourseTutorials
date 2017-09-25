
public class Cicek {
	
	private int yaprakSayisi;
	private String renk;
	private boolean kokuluMu;
	private boolean dikeniVarMi;
	private String tur;
	
	public Cicek(){
		
	}
	
	public Cicek(
		int yaprakSayisi,String renk,boolean koku,boolean diken,String tur
		){
		this.yaprakSayisi = yaprakSayisi;
		this.renk = renk;
		this.kokuluMu = koku;
		this.dikeniVarMi = diken;
		this.tur = tur;
	}
	
	public void detaylariYazdir(){
		System.out.println("Yaprak sayýsý: "+yaprakSayisi);
		System.out.println("Renk: "+renk);
		System.out.println("Koku: "+kokuluMu);
		System.out.println("Diken: "+dikeniVarMi);
		System.out.println("Tür: "+tur);
	}
	
	
	public int getYaprakSayisi() {
		return yaprakSayisi;
	}

	public void setYaprakSayisi(int yaprakSayisi) {
		this.yaprakSayisi = yaprakSayisi;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public boolean isKokuluMu() {
		return kokuluMu;
	}

	public void setKokuluMu(boolean kokuluMu) {
		this.kokuluMu = kokuluMu;
	}

	public boolean isDikeniVarMi() {
		return dikeniVarMi;
	}

	public void setDikeniVarMi(boolean dikeniVarMi) {
		this.dikeniVarMi = dikeniVarMi;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	

}
