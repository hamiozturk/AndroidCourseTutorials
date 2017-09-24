
public class Insan extends Adem {
	// extends ile sadece bir classdan t�retebiliriz

	public void nefesAl(){
		System.out.println("�nsan nefes ald�");
		//super.nefesAl(); // Miras al�nan s�n�ftan gelen de�er
		/*
		 * Miras al�nan class i�erisindeki metodun
		 * i�eri�ini de�i�tirmemiz gereken durumlar olabilir.
		 * �rne�in nefesAl metodunu �al��t�rd��m�zda
		 * 'Adem nefes ald�' yaz�s�n� insan.nefesAl() olarak 
		 * �al��t�rd���m�zda 'Insan nefes ald� ' �eklinde g�rmek
		 * isteyebilece�imiz durumlar ile kar��la�abiliriz.
		 * 
		 * Bu nedenle atadan gelen de�eri hi�e saymak istersek
		 * ayn� metodu extends keyword'� kulland���m�z classda
		 * tan�mlamak durumunda oluruz. ve metot i�eri�ini
		 * son olarak nas�l kullan�lmas� gerekiyorsa i�eri�ini
		 * o �ekilde doldururuz.
		 * 
		 * Yine ayn� zamanda do�rudan miras al�nan
		 * s�n�ftaki de�eri kullanmak istersek
		 * metot i�eri�i super.metotAdi() �eklinde kullan�l�r
		 * 
		 * BU ��LEME OVERR�DE (EZME) ��LEM� DEN�R. 
		 */
	}
}
