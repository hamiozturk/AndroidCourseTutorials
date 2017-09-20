import java.io.File;


public class Ornek3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File dosya = new File("D:\\Temp\\serifgungor\\android");
		boolean b;
		
		b = dosya.isFile();
		
		if(b==true){
			System.out.println("Bu dosyadýr");
		}else if(b==false){
			System.out.println("Bu dosya deðildir");
		}

	}

}
