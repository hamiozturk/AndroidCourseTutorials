import java.io.File;


public class Dosya1 {

	public static void main(String[] args) {
		
		// DOSYA/KLAS�R �SM� DE���T�RME
		
		File klasorIsmi = new File("E:\\Temp\\ANDROID");
		
		File yeniKlasorIsmi = new File("E:\\Temp\\ANDROID2");
		
		if (klasorIsmi.renameTo(yeniKlasorIsmi)==true) { // true ise
			System.out.println("ANDROID isimli klas�r/dosya, ANDROID2 olarak de�i�tirildi");
		}else{ // de�i�tirilemediyse 
			System.out.println("Klas�r/Dosya ismi de�i�tirilemedi");
		}

	}

}
