import java.io.File;


public class Dosya5 {


	public static void main(String[] args) {
		
		//S�LME �RNE��
		
		File f = new File("E:\\Temp\\ANDROID\\YeniKlas�r");
		
		boolean b = f.delete();
		
		if(b==true){
			System.out.println("Dosya/klas�r ba�ar�yla silindi.");
		}else{
			System.out.println("Dosya/klas�r silinemedi.");
		}
		
		

	}

}
