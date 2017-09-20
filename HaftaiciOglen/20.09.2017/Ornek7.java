import java.io.File;


public class Ornek7 {

	public static void main(String[] args) {
		
		File file = new File("D:\\Temp\\serifgungor");
		
		File[] dizi = file.listFiles();
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i].delete();
		}
		

	}

}
