import java.io.File;


public class Dosya2 {


	public static void main(String[] args) {
		
		File dosya = new File("E:\\Temp\\ANDROID\\YeniKlas�r");
		// ANDRO�D KLAS�R� ��ER�S�NE YeniKlas�r olu�turmak istersek
		
		boolean b;
		
		b = dosya.mkdir();
		
		if(b==true){
			System.out.println("KLAS�R OLU�TURULDU");
		}else{
			System.out.println("KLAS�R OLU�TURULAMADI");
		}
		
		
		/*
		 * 
		File dosya = new File("E:\\Temp\\ANDROID\\YeniKlas�r\\YeniKlas�r");
		// ANDRO�D KLAS�R� ��ER�S�NE YeniKlas�r yoksa olu�turup i�ine YeniKlas�r olu�turmak istersek
		
		boolean b  = dosya.mkdirs();
		
		if(b==true){
			System.out.println("KLAS�R OLU�TURULDU");
		}else{
			System.out.println("KLAS�R OLU�TURULAMADI");
		}
	
		*/
		
		

	}

}
