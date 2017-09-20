import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Dosya10 {

	
	public static void main(String[] args) {
		
		//DOSYA OKUMA ÖRNEÐÝ
		
		try{
			File file = new File("E:\\Temp\\ANDROID\\android.txt");
			FileInputStream fis = new FileInputStream(file);
			
			int ch = 0;
			
			try{
				while ( (ch=fis.read() ) !=-1 ) {
					System.out.print((char)ch);
				}
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
	}

}
