
public class ExceptionHandlingOrnek2 {

	public static void main(String[] args) {
		
		
		
		try {
			String isim = "�ER�F";
			
			System.out.println(isim.charAt(7));
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace(); //Hatay� ve sat�r�n� d�ner
			//System.out.println(e.toString());
		}

	}

}
