import java.util.ArrayList;


public class Baslangic {


	public static void main(String[] args) {
		
		
		ArrayList<String> dersler = new ArrayList<String>();
		dersler.add("Android");
		dersler.add("Java SE");
		dersler.add("Java EE");
		dersler.add("PHP");
		dersler.add("Python");
		
		ThreadOlustur to = new ThreadOlustur(1,dersler);
		to.setPriority(1);
		to.start();
		
		ThreadOlustur to2 = new ThreadOlustur(5,dersler);
		to2.setPriority(2);
		to2.start();

	}

}
