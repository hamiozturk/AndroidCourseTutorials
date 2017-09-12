import java.util.Scanner;

public class StringMetotlari {

	public static void main(String[] args) {

		// STRÝNG METOTLARI
		
		String metin = "ANDROÝDPROGRAMLAMADERSÝ";
		
		System.out.println(metin.length()); //length uzunluðu döner
		System.out.println(metin.charAt(0)); //i'ninci karakteri döner
		System.out.println(metin.toUpperCase()); // tüm karakterler küçük
		System.out.println(metin.toLowerCase()); // tüm karakterler büyük
		System.out.println(metin.substring(7, 18));
		// baþlangýç ve bitiþ indisleri aralýðýndaki stringi döner
		System.out.println(metin.indexOf("DERS"));
		// aranan indis string içerisinde varsa konumunu, yoksa -1'i döner
		System.out.println(metin.lastIndexOf("DERS"));

	}

}
