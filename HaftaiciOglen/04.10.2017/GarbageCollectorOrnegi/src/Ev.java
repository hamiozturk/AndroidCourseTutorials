
public class Ev {
	
	/*
	 * Bir objenin gerçekten çöp olup olmadýðýna karar veren
	 * mekanizma, çöp toplayýcýsýdýr (garbage collector)
	 * 
	 * Uygulamada bir obje, kullanýlmýyorsa çöp toplayýcýsý tarafýndan
	 * hafýzadan silinir. Bu iþlem kodu yazan kiþi bakýmýndan 
	 * rahatlýkla oluþturulabilir.
	 * 
	 * finalize() metodu çöp toplayýcý tarfýndan objeyi hafýzadan
	 * silmeden önce çalýþtýrýr.
	 * 
	 * Ayný idam mahkumlarýnýn son isteði gibi, finalize() metodunun
	 * objenin yapmasý gereken son iþlemi olarak düþünebiliriz.
	 */
	
	int yasayanSayisi=0;
	
	public Ev(int yasayanSayisi){
		this.yasayanSayisi = yasayanSayisi;
		System.out.println("Ev üretiliyor"+this.yasayanSayisi);
	}
	
	
	public void finalize(){
		System.out.println("Ev yok ediliyor"+this.yasayanSayisi);
	}
	

}
