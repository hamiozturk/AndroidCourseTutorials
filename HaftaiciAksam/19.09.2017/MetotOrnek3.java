import java.util.Random;


public class MetotOrnek3 {

	
	public int sayiUret(){		
		Random rnd = new Random();		
		return rnd.nextInt(10);
	}
	
	public static void main(String[] args) {
		
		MetotOrnek3 nesne = new MetotOrnek3();

		int sayi1 = nesne.sayiUret();
		int sayi2 = nesne.sayiUret();
		
		if(sayi1>sayi2){
			System.out.println("Say�1, say�2'den b�y�kt�r."+"Say�1: "+sayi1+" Say�2: "+sayi2);
		}else if(sayi2>sayi1){
			System.out.println("Say�2, say�1'den b�y�kt�r."+"Say�1: "+sayi1+" Say�2: "+sayi2);
		}else{
			System.out.println("Say�lar e�ittir."+" Say�: "+sayi1);
		}
		
		

	}

}
