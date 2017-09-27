import java.util.Scanner;
import java.util.Vector;


public class Ornek2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v = new Vector<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç eleman gireceksiniz");
		int sayi = sc.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			System.out.println((i+1)+". elemaný giriniz;");
			v.add(sc.next());
		}
		
		System.out.println("Silinecek elemaný giriniz;");
		String sil = sc.next();
		
		for (int i = 0; i < sayi; i++) {
			if(sil.equals(v.get(i))){
				v.remove(i);
			}
		}
		
		System.out.println("Listenin son hali");
		for (String string : v) {
			System.out.println(string);
		}
		
		

	}

}
