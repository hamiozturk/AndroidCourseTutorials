
public class Insan extends Adem {
	// extends ile sadece bir classdan türetebiliriz

	public void nefesAl(){
		System.out.println("Ýnsan nefes aldý");
		//super.nefesAl(); // Miras alýnan sýnýftan gelen deðer
		/*
		 * Miras alýnan class içerisindeki metodun
		 * içeriðini deðiþtirmemiz gereken durumlar olabilir.
		 * Örneðin nefesAl metodunu çalýþtýrdðýmýzda
		 * 'Adem nefes aldý' yazýsýný insan.nefesAl() olarak 
		 * çalýþtýrdýðýmýzda 'Insan nefes aldý ' þeklinde görmek
		 * isteyebileceðimiz durumlar ile karþýlaþabiliriz.
		 * 
		 * Bu nedenle atadan gelen deðeri hiçe saymak istersek
		 * ayný metodu extends keyword'ü kullandýðýmýz classda
		 * tanýmlamak durumunda oluruz. ve metot içeriðini
		 * son olarak nasýl kullanýlmasý gerekiyorsa içeriðini
		 * o þekilde doldururuz.
		 * 
		 * Yine ayný zamanda doðrudan miras alýnan
		 * sýnýftaki deðeri kullanmak istersek
		 * metot içeriði super.metotAdi() þeklinde kullanýlýr
		 * 
		 * BU ÝÞLEME OVERRÝDE (EZME) ÝÞLEMÝ DENÝR. 
		 */
	}
}
