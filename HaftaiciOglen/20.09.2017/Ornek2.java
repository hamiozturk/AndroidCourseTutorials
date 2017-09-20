import java.io.File;


public class Ornek2 {

	public static void main(String[] args) {
		File dosya = new File("D:\\Temp\\serifgungor\\android");
		boolean b;
		
		b = dosya.delete();
		
		if(b==true){
			System.out.println("Klasör silindi");
		}else{
			System.out.println("Klasör silinemedi");
		}

	}

}
