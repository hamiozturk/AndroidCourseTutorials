
public class MetotOrnek6 {
	
	int rakam = 0;
	String isim = "";

	public MetotOrnek6(){ // BOÞ CONSTRUCTOR
		
	}
	public void yazdir(){
		System.out.println(rakam);
		System.out.println(isim);
	}
	
	public MetotOrnek6(int sayi){ // DOLU CONSTRUCTOR
		this.rakam =sayi;
	}
	public MetotOrnek6(int sayi,String isim){ // DOLU CONSTRUCTOR
		this.rakam =sayi;
		this.isim = isim;
	}
	
	public static void main(String[] args) {
		MetotOrnek6 ornek = new MetotOrnek6(10,"ÞERÝF");
		ornek.yazdir();
	}

}
