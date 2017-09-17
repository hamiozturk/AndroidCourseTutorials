
public class ExceptionHandlingOrnek2 {

	public static void main(String[] args) {
		
		
		
		try {
			String isim = "ÞERÝF";
			
			System.out.println(isim.charAt(7));
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace(); //Hatayý ve satýrýný döner
			//System.out.println(e.toString());
		}

	}

}
