
public class Insan extends Adem {
	
	
	/*
	 * KALITIMIN OLMAZSA OLMZA ÖZELLÝKLERÝ
	 * 
	 * 1. özellik
	 * Bir classdan kalýtým alabilmek için extends kelimesinden sonra sadece 1
	 * class ismi yazýlabilir
	 * 
	 * 2. özellik
	 * metot override iþlemi
	 * 
	 * 3. özellik
	 * super keyword'^ü ile üst sýnýftan(atadan) gelen deðeri
	 * metot içerisinde belirtebiliriz.
	 * 
	 * örneðin uyu() metodu içine super.uyu(); yazarsak üst sýnýftaki 
	 * metot içerisini dikkate alýr
	 * 
	 * 
	 */
	
	
	
	//METOT OVERRÝDE ÝÞLEMÝ
	public void uyu(){
		System.out.println("Insan uyudu.");
	}
	
	public void nefesAl(){
		super.nefesAl(); //üst sýnýftan gelen deðeri dikkate al
	}
	
	/*
	 * extends keyword'ünden sonra sadece 1 class ismi belirtilebilir
	 * yani Insan Adem'den kalýtým (miras) almýþ olur.
	 * 
	 * Kalýtým sayesinde Adem içerisindeki tüm fieldlarý ve metotlarý
	 * Insan classýnda extends Adem diyerek doðrudan kullanabiliriz.
	 * 
	 * Insan class'ý new'leme (Object oluþturma) yapýlarak oluþturulduðunda
	 * Insan classý içerisinde olmayan metotlar varsa Adem classý içerisinde
	 * var olan class isimleri doðrudan gösterilmiþ ve Insan classýnda varmýþ
	 * gibi kullanýlabilir.
	 * 
	 * Metot override iþlemi yapabiliriz. Yani Adem classý içerisindeki
	 * nefesAl metotu "Adem nefes aldý" þeklinde çýktý üretiyor iken
	 * Insan classýnda ayný metot ismini oluþturup içerisini biz belirtirsek
	 * adem classý içindeki nefes al metodu yerine bizim yazdýðýmýz metot devreye
	 * girecektir. yani bu iþlem metot override ( ezme) iþlemidir.
	 * 
	 */

}
