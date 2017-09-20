import java.io.File;


public class Dosya9 {


	public int dosyalariSil(String konum){
		int sayac = 0;
		
		File f = new File(konum);
		
		File[] fDizi = f.listFiles();
		
		for (int i = 0; i < fDizi.length; i++) {
			if(fDizi[i].delete()){
				sayac++;
			}
		}
		
		return sayac;
	}
	

	public static void main(String[] args) {
		
		Dosya9 d = new Dosya9();
		int sayi = d.dosyalariSil("E:\\Temp\\ANDROID");
		System.out.println(sayi+" adet dosya silindi.");
		

	}

}
