import java.io.File;


public class Dosya3 {


	public static void main(String[] args) {
		
		File f = new File("E:\\Temp\\ANDROID\\YeniKlasör");
		
		if(f.isFile()){
			System.out.println("Bu bir dosyadýr");
		}else{
			System.out.println("Bu bir dosya deðildir");
		}
		
		
		if(f.isDirectory()){
			System.out.println("Bu bir dizin/klasördür.");
		}else{
			System.out.println("Bu bir dizin/klasör deðildir.");
		}
		

	}

}
