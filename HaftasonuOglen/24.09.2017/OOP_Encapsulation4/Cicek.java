
public class Cicek {
	
	private String renk;
	private String cins;
	private int yaprakSayisi;
	private boolean kokuluMu;
	private boolean dikeniVarMi;
	
	public Cicek(){
		
	}

	public Cicek(String renk, String cins, int yaprakSayisi, boolean kokuluMu,
			boolean dikeniVarMi) {
		this.renk = renk;
		this.cins = cins;
		this.yaprakSayisi = yaprakSayisi;
		this.kokuluMu = kokuluMu;
		this.dikeniVarMi = dikeniVarMi;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	public int getYaprakSayisi() {
		return yaprakSayisi;
	}

	public void setYaprakSayisi(int yaprakSayisi) {
		this.yaprakSayisi = yaprakSayisi;
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
	
	public void detaylariYazdir(){
		System.out.println("�i�e�in rengi: "+getRenk());
		System.out.println("�i�e�in cinsi: "+getCins());
		
		if(getYaprakSayisi()==0){
			System.out.println("�i�e�in yapra�� yok");
		}else{
			System.out.println("�i�e�in yaprak say�s�: "+getYaprakSayisi());
		}
		
		if(isDikeniVarMi()==false){
			System.out.println("�i�e�in dikeni yok");
		}else{
			System.out.println("�i�e�in dikeni var");
		}
		
		if(isKokuluMu()){
			System.out.println("�i�e�in kokusu var");
		}else{
			System.out.println("�i�e�in kokusu yok");
		}
		
		
	}
	
	

}
