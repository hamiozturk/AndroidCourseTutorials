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
			System.out.println("Sayı1, sayı2'den büyüktür."+"Sayı1: "+sayi1+" Sayı2: "+sayi2);
		}else if(sayi2>sayi1){
			System.out.println("Sayı2, sayı1'den büyüktür."+"Sayı1: "+sayi1+" Sayı2: "+sayi2);
		}else{
			System.out.println("Sayılar eşittir."+" Sayı: "+sayi1);
		}
		
		

	}

}
