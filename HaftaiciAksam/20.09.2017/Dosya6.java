import java.io.File;


public class Dosya6 {

	
	public static void main(String[] args) {
		
		String dosyaAdi = "E:\\Temp\\ANDROID\\metin.txt";
	
		File f = new File(dosyaAdi);
		
		System.out.println(dosyaAdi + " - " + f.length()+" bayt");

	}

}
