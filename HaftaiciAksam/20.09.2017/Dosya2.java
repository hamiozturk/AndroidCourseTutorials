import java.io.File;


public class Dosya2 {


	public static void main(String[] args) {
		
		File dosya = new File("E:\\Temp\\ANDROID\\YeniKlasör");
		// ANDROÝD KLASÖRÜ ÝÇERÝSÝNE YeniKlasör oluþturmak istersek
		
		boolean b;
		
		b = dosya.mkdir();
		
		if(b==true){
			System.out.println("KLASÖR OLUÞTURULDU");
		}else{
			System.out.println("KLASÖR OLUÞTURULAMADI");
		}
		
		
		/*
		 * 
		File dosya = new File("E:\\Temp\\ANDROID\\YeniKlasör\\YeniKlasör");
		// ANDROÝD KLASÖRÜ ÝÇERÝSÝNE YeniKlasör yoksa oluþturup içine YeniKlasör oluþturmak istersek
		
		boolean b  = dosya.mkdirs();
		
		if(b==true){
			System.out.println("KLASÖR OLUÞTURULDU");
		}else{
			System.out.println("KLASÖR OLUÞTURULAMADI");
		}
	
		*/
		
		

	}

}
