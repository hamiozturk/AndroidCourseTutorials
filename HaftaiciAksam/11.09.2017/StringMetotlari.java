import java.util.Scanner;

public class StringMetotlari {

	public static void main(String[] args) {

		// STR�NG METOTLARI
		
		String metin = "ANDRO�DPROGRAMLAMADERS�";
		
		System.out.println(metin.length()); //length uzunlu�u d�ner
		System.out.println(metin.charAt(0)); //i'ninci karakteri d�ner
		System.out.println(metin.toUpperCase()); // t�m karakterler k���k
		System.out.println(metin.toLowerCase()); // t�m karakterler b�y�k
		System.out.println(metin.substring(7, 18));
		// ba�lang�� ve biti� indisleri aral���ndaki stringi d�ner
		System.out.println(metin.indexOf("DERS"));
		// aranan indis string i�erisinde varsa konumunu, yoksa -1'i d�ner
		System.out.println(metin.lastIndexOf("DERS"));

	}

}
