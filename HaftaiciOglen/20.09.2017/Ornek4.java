import java.io.File;


public class Ornek4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File dosya = new File("D:\\Temp\\serifgungor\\android");
		boolean b;
		
		b = dosya.isDirectory();
		if(b==true){
			System.out.println("Bu klas�rd�r");
		}else if(b==false){
			System.out.println("Bu klas�r de�ildir");
		}

	}

}
