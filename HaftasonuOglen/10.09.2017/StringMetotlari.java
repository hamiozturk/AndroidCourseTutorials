public class StringMetotlari {

	public static void main(String[] args) {
	
		String str = "YUNAN�STANBULGAR�STAN";

		System.out.println(str.length());
		// uzunlu�u d�ner

		System.out.println(str.substring(5, 13));
		// string i�erisinde ba�lang�� biti� de�erleri aras�ndaki karakterleri d�ner

		System.out.println(str.toLowerCase());
		// T�m karakterleri k���k harfe d�n��t�r�r

		System.out.println(str.toUpperCase());
		// T�m karakterleri b�y�k harfe d�n��t�r�r

		System.out.println(str.charAt(0));
		//charAt i'ninci indisin karakterini d�ner

		System.out.println(str.indexOf("�STANBUL"));
		//ARANAN KEL�ME VARSA �LK BULDU�U �ND�S�, YOKSA -1'i d�ner

		System.out.println(str.lastIndexOf("�STANBUL"));
		//ARANAN KEL�MEDE SON BULDU�U �ND�S�, YOKSA -1'i d�ner
		
	}

}
