public class StringMetotlari {

	public static void main(String[] args) {
	
		String str = "YUNANÝSTANBULGARÝSTAN";

		System.out.println(str.length());
		// uzunluðu döner

		System.out.println(str.substring(5, 13));
		// string içerisinde baþlangýç bitiþ deðerleri arasýndaki karakterleri döner

		System.out.println(str.toLowerCase());
		// Tüm karakterleri küçük harfe dönüþtürür

		System.out.println(str.toUpperCase());
		// Tüm karakterleri büyük harfe dönüþtürür

		System.out.println(str.charAt(0));
		//charAt i'ninci indisin karakterini döner

		System.out.println(str.indexOf("ÝSTANBUL"));
		//ARANAN KELÝME VARSA ÝLK BULDUÐU ÝNDÝSÝ, YOKSA -1'i döner

		System.out.println(str.lastIndexOf("ÝSTANBUL"));
		//ARANAN KELÝMEDE SON BULDUÐU ÝNDÝSÝ, YOKSA -1'i döner
		
	}

}
