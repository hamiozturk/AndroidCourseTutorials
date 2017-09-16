
public class Ornek1 {

	public static void main(String[] args) {
		int sayi = 10;
		do{
			System.out.println(sayi);
			sayi++;
		}while(sayi<20);
		
		System.out.println("----");

		sayi = 10;
		while(sayi<20){
			System.out.println(sayi);
			sayi++;
		}
		
		System.out.println("----");
		
		sayi = 10;
		for(int i = sayi; i<20; i++){
			System.out.println(i);
		}
		

	}

}
