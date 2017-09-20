import java.io.File;


public class Ornek5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		File f = new File("D:\\Temp\\serifgungor\\android\\deneme");
		
		if(f.exists()==true){
			System.out.println("Dosya yada Klasör var");
		}else{
			System.out.println("Dosya yada Klasör yok");
		}
		

	}

}
