
public class Ornek1 {

	public static void main(String[] args) {
		
		// ÝÇ ÝÇE FOR DÖNGÜSÜ KULLANIMI
		
		int sayac = 0;
		
		for(int i=0; i<10; i++){
			
			//sayac +=1;
			//sayac = sayac +1;
			sayac++;
			
			for(int j = 0; j < 50; j++) {
				sayac = sayac +1;
			}
		}
		
		System.out.println(sayac);
	
	}

}
