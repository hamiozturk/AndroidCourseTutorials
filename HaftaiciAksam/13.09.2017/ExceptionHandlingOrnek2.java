
public class Ornek2 {


	public static void main(String[] args) {
		
		try{
			String metin = "MERHABA";			
			System.out.println(metin.charAt(10));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("String uzunlu�u d��ar�s�na ��kt�n�z");
		}
		

	}

}
