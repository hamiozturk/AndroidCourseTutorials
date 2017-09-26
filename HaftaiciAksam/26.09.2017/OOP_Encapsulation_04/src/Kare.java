
public class Kare {
	
	private int kenarUzunlugu;
	
	public Kare(){}	
	public Kare(int kenarUzunlugu){
		this.kenarUzunlugu = kenarUzunlugu;
	}

	public int getKenarUzunlugu() {
		return kenarUzunlugu;
	}

	public void setKenarUzunlugu(int kenarUzunlugu) {
		this.kenarUzunlugu = kenarUzunlugu;
	}
	
	public int getAlan(){
		return kenarUzunlugu*kenarUzunlugu;
	}
	
	public int getCevre(){
		return kenarUzunlugu*4;
	}
	
	
	

}
