import java.io.File;


public class Dosya3 {


	public static void main(String[] args) {
		
		File f = new File("E:\\Temp\\ANDROID\\YeniKlas�r");
		
		if(f.isFile()){
			System.out.println("Bu bir dosyad�r");
		}else{
			System.out.println("Bu bir dosya de�ildir");
		}
		
		
		if(f.isDirectory()){
			System.out.println("Bu bir dizin/klas�rd�r.");
		}else{
			System.out.println("Bu bir dizin/klas�r de�ildir.");
		}
		

	}

}
