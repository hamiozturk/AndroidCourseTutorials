import java.io.File;


public class Ornek1 {

	public static void main(String[] args) {
		
		// DOSYA ÝÞLEMLERÝ
	
		//KLASÖR OLUÞTURUR
		File dosya = new File("D:\\Temp\\serifgungor\\android");
		boolean b;
		
		b = dosya.mkdir();

		if(b==true){
			System.out.println("Klasör oluþturuldu");
		}else{
			System.out.println("Klasör oluþturulamadý");
		}
		
		
	}

}
