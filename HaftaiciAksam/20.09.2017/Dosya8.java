import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Dosya8 {


	public boolean dosyaOlustur(String dizin,String dosyaIsmi){
		
		String tamKonum = dizin+"\\"+dosyaIsmi;
		File f = new File(tamKonum);
		
		boolean b = false;
		
		try {
			b = f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;		
	}

	public static void main(String[] args) {
		Dosya8 dosya = new Dosya8();
		
		
		/*
		System.out.print("Kaç adet dosya oluþturulsun ? ");
		Scanner sc = new Scanner(System.in);
		int sayi = sc.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			System.out.println("Dosya adý ve uzantýsý giriniz");
			String dosyaAdi = sc.next();
			dosya.dosyaOlustur("E:\\Temp\\ANDROID",dosyaAdi);
		}
		*/
		
		
		for (int i = 0; i < 50; i++) {
			dosya.dosyaOlustur("E:\\Temp\\ANDROID","android"+i+".txt");
		}
		
	}

}
