
public class Cicek {
	private String renk;
	private String tur;
	private boolean kokuluMu;
	private boolean dikenliMi;
	private int yaprakSayisi;
	
	public Cicek(){
		
	}
	public Cicek(String renk,String tur,boolean kokuluMu,boolean dikenliMi,int yaprakSayisi){
		this.renk = renk;
		this.tur = tur;
		this.dikenliMi = dikenliMi;
		this.kokuluMu = kokuluMu;
		this.yaprakSayisi = yaprakSayisi;
	}
	
	public void tumDetaylariYaz(){
		System.out.println("Renk: "+renk);
		System.out.println("Tür: "+getTur());
		if(dikenliMi==true){
			System.out.println("Diken: var");
		}else{
			System.out.println("Diken: yok");
		}
		if(kokuluMu==true){
			System.out.println("Koku: var");
		}else{
			System.out.println("Koku: yok");
		}
		System.out.println("Yaprak Sayýsý: "+yaprakSayisi);
	}
	
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	public boolean isKokuluMu() {
		return kokuluMu;
	}
	public void setKokuluMu(boolean kokuluMu) {
		this.kokuluMu = kokuluMu;
	}
	public boolean isDikenliMi() {
		return dikenliMi;
	}
	public void setDikenliMi(boolean dikenliMi) {
		this.dikenliMi = dikenliMi;
	}
	public int getYaprakSayisi() {
		return yaprakSayisi;
	}
	public void setYaprakSayisi(int yaprakSayisi) {
		this.yaprakSayisi = yaprakSayisi;
	}
	
}
