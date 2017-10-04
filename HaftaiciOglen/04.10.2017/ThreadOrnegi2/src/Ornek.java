
public class Ornek {


	public static void main(String[] args) {
	

		String[] dizi = new String[5];
		dizi[0] = "a";
		dizi[1] = "b";
		dizi[2] = "c";
		dizi[3] = "d";
		dizi[4] = "e";
		
		String[] dizi2 = {"1","2","3","4","5"};
		
		ThreadSinifi th = new ThreadSinifi(dizi);
		th.start();
		
		ThreadSinifi th2 = new ThreadSinifi(dizi2);
		th2.start();
		
		
		
		
		
	}

}
