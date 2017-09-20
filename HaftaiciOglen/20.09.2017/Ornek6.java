import java.io.File;
import java.io.IOException;


public class Ornek6 {

	public boolean dosyaOlustur(String dosyaAdi){
		boolean b = false;
		//DOSYA OLUÞTURUR
		File f = new File("D:\\Temp\\serifgungor\\"+dosyaAdi);		
		try {
			b = f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	
	public static void main(String[] args) {
		Ornek6 dosya = new Ornek6();
		
		for (int i = 0; i < 10; i++) {
			if(dosya.dosyaOlustur("android"+i+".rar")){
				System.out.println("android"+i+".rar"+" oluþturuldu");
			}else{
				System.out.println("android"+i+".rar"+" oluþturulamadý");
			}
		}
	}

}
