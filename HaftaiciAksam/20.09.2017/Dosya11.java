import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Dosya11 {

	
	public static void main(String[] args) {
		// DOSYAYA YAZMA ÖRNEÐÝ
		
		String dosya = "E:\\Temp\\ANDROID\\android.txt";
		File file = new File(dosya);
		System.out.println("Lütfen dosyaya eklemek istediklerinizi giriniz");
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int ch = 0;
		
		try{
			FileInputStream fis = new FileInputStream(file);
			try{
				while ((ch=fis.read())!=-1) {
					str = str+(char)ch;
				}
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		File file2 = new File(dosya);
		try{
			FileOutputStream fos = new FileOutputStream(file2);
			try{
				for (int i = 0; i < str.length(); i++) {
					int chr = (int)str.charAt(i);
					fos.write(chr);
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		

	}

}
