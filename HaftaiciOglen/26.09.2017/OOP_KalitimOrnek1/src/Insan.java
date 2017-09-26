
public class Insan extends Adem {
	
	
	/*
	 * KALITIMIN OLMAZSA OLMZA �ZELL�KLER�
	 * 
	 * 1. �zellik
	 * Bir classdan kal�t�m alabilmek i�in extends kelimesinden sonra sadece 1
	 * class ismi yaz�labilir
	 * 
	 * 2. �zellik
	 * metot override i�lemi
	 * 
	 * 3. �zellik
	 * super keyword'^� ile �st s�n�ftan(atadan) gelen de�eri
	 * metot i�erisinde belirtebiliriz.
	 * 
	 * �rne�in uyu() metodu i�ine super.uyu(); yazarsak �st s�n�ftaki 
	 * metot i�erisini dikkate al�r
	 * 
	 * 
	 */
	
	
	
	//METOT OVERR�DE ��LEM�
	public void uyu(){
		System.out.println("Insan uyudu.");
	}
	
	public void nefesAl(){
		super.nefesAl(); //�st s�n�ftan gelen de�eri dikkate al
	}
	
	/*
	 * extends keyword'�nden sonra sadece 1 class ismi belirtilebilir
	 * yani Insan Adem'den kal�t�m (miras) alm�� olur.
	 * 
	 * Kal�t�m sayesinde Adem i�erisindeki t�m fieldlar� ve metotlar�
	 * Insan class�nda extends Adem diyerek do�rudan kullanabiliriz.
	 * 
	 * Insan class'� new'leme (Object olu�turma) yap�larak olu�turuldu�unda
	 * Insan class� i�erisinde olmayan metotlar varsa Adem class� i�erisinde
	 * var olan class isimleri do�rudan g�sterilmi� ve Insan class�nda varm��
	 * gibi kullan�labilir.
	 * 
	 * Metot override i�lemi yapabiliriz. Yani Adem class� i�erisindeki
	 * nefesAl metotu "Adem nefes ald�" �eklinde ��kt� �retiyor iken
	 * Insan class�nda ayn� metot ismini olu�turup i�erisini biz belirtirsek
	 * adem class� i�indeki nefes al metodu yerine bizim yazd���m�z metot devreye
	 * girecektir. yani bu i�lem metot override ( ezme) i�lemidir.
	 * 
	 */

}
