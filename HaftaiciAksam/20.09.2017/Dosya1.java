import java.io.File;


public class Dosya1 {

	public static void main(String[] args) {
		
		// DOSYA/KLASÖR ÝSMÝ DEÐÝÞTÝRME
		
		File klasorIsmi = new File("E:\\Temp\\ANDROID");
		
		File yeniKlasorIsmi = new File("E:\\Temp\\ANDROID2");
		
		if (klasorIsmi.renameTo(yeniKlasorIsmi)==true) { // true ise
			System.out.println("ANDROID isimli klasör/dosya, ANDROID2 olarak deðiþtirildi");
		}else{ // deðiþtirilemediyse 
			System.out.println("Klasör/Dosya ismi deðiþtirilemedi");
		}

	}

}
