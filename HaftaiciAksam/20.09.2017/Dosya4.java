import java.io.File;


public class Dosya4 {


	public static void main(String[] args) {
		
		File f = new File("E:\\ANDROID\\YeniKlasör");		
		
		if(f.canRead()){
			System.out.println("Bu dosya/klasör okunabilir");
		}else{
			System.out.println("Okuma izniniz bulunmamaktadýr.");
		}
		
		if(f.canWrite()){
			System.out.println("Bu dosyaya/klasöre yazýlabilir");
		}else{
			System.out.println("Yazma izniniz bulunmamaktadýr.");
		}
		
		if(f.canExecute()){
			System.out.println("Çalýþtýrma izniniz bulunmaktadýr.");
		}else{
			System.out.println("Çalýþtýrma izniniz bulunmamaktadýr.");
		}
		
		if(f.exists()){
			System.out.println("Gerçekten böyle bir dizin/dosya vardýr.");
		}else{
			System.out.println("Böyle bir dizin/dosya bulunmamaktadýr.");
		}

	}

}
