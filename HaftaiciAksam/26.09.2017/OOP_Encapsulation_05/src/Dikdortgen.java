
public class Dikdortgen {
	
	//GLOBAL FIELD AREA
	private int kisaKenar;
	private int uzunKenar;
	
	public Dikdortgen(){
		// BOÞ CONSTRUCTOR
	}

	public Dikdortgen(int kisaKenar, int uzunKenar) {
		this.kisaKenar = kisaKenar;
		this.uzunKenar = uzunKenar;
	}


	public int getKisaKenar() {
		return kisaKenar;
	}

	public void setKisaKenar(int kisaKenar) {
		this.kisaKenar = kisaKenar;
	}

	public int getUzunKenar() {
		return uzunKenar;
	}

	public void setUzunKenar(int uzunKenar) {
		this.uzunKenar = uzunKenar;
	}

	
	public int getAlan(){
		return uzunKenar*kisaKenar;
	}
	
	public int getCevre(){
		return (kisaKenar*2)+(uzunKenar*2);
	}
	
	

}
