import java.io.File;


public class Dosya4 {


	public static void main(String[] args) {
		
		File f = new File("E:\\ANDROID\\YeniKlas�r");		
		
		if(f.canRead()){
			System.out.println("Bu dosya/klas�r okunabilir");
		}else{
			System.out.println("Okuma izniniz bulunmamaktad�r.");
		}
		
		if(f.canWrite()){
			System.out.println("Bu dosyaya/klas�re yaz�labilir");
		}else{
			System.out.println("Yazma izniniz bulunmamaktad�r.");
		}
		
		if(f.canExecute()){
			System.out.println("�al��t�rma izniniz bulunmaktad�r.");
		}else{
			System.out.println("�al��t�rma izniniz bulunmamaktad�r.");
		}
		
		if(f.exists()){
			System.out.println("Ger�ekten b�yle bir dizin/dosya vard�r.");
		}else{
			System.out.println("B�yle bir dizin/dosya bulunmamaktad�r.");
		}

	}

}
