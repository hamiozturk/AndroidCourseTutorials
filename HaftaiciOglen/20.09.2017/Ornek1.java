import java.io.File;


public class Ornek1 {

	public static void main(String[] args) {
		
		// DOSYA ��LEMLER�
	
		//KLAS�R OLU�TURUR
		File dosya = new File("D:\\Temp\\serifgungor\\android");
		boolean b;
		
		b = dosya.mkdir();

		if(b==true){
			System.out.println("Klas�r olu�turuldu");
		}else{
			System.out.println("Klas�r olu�turulamad�");
		}
		
		
	}

}
