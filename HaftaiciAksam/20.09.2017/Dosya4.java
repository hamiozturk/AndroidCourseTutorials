import java.io.File;


public class Dosya4 {


	public static void main(String[] args) {
		
		File f = new File("E:\\ANDROID\\YeniKlasör");		
		
		if(f.canRead()){
			System.out.println("Bu dosya/klasör okunabilir");
		}else{
			System.out.println("Okuma izniniz bulunmamaktadır.");
		}
		
		if(f.canWrite()){
			System.out.println("Bu dosyaya/klasöre yazılabilir");
		}else{
			System.out.println("Yazma izniniz bulunmamaktadır.");
		}
		
		if(f.canExecute()){
			System.out.println("Çalıştırma izniniz bulunmaktadır.");
		}else{
			System.out.println("Çalıştırma izniniz bulunmamaktadır.");
		}
		
		if(f.exists()){
			System.out.println("Gerçekten böyle bir dizin/dosya vardır.");
		}else{
			System.out.println("Böyle bir dizin/dosya bulunmamaktadır.");
		}

	}

}
