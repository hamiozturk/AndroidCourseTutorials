import java.io.File;


public class Dosya7 {


	public static void main(String[] args) {
		
		File dosya = new File("E:\\Temp\\ANDROID");
		
		File[] dizi = dosya.listFiles();
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i].getName());
		}

	}

}
