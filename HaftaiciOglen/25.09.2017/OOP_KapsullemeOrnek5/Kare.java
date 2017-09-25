
public class Kare {
	
	private int kenar;
	
	public Kare(){}	
	public Kare(int kenar){
		this.kenar = kenar;
	}
	
	public int getKenar(){
		return kenar;
	}
	
	public void setKenar(int kenar){
		this.kenar = kenar;
	}
	
	public int getAlan(){
		return kenar*kenar;
	}
	
	public int getCevre(){
		return kenar*4;
	}
	

}
