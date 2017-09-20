import java.io.File;


public class Dosya5 {


	public static void main(String[] args) {
		
		//SÝLME ÖRNEÐÝ
		
		File f = new File("E:\\Temp\\ANDROID\\YeniKlasör");
		
		boolean b = f.delete();
		
		if(b==true){
			System.out.println("Dosya/klasör baþarýyla silindi.");
		}else{
			System.out.println("Dosya/klasör silinemedi.");
		}
		
		

	}

}
