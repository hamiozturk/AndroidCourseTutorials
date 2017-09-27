import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Calistir {

	
	public void elemanGir(List<String> liste){
		Scanner sc = new Scanner(System.in);
		liste.add(sc.next());
	}
	
	public void elemanlariDondur(List<String> liste){
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
	}
	
	public void elemanSil(List<String> liste, int indis){
		liste.remove(indis);
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Eleman sayýsý giriniz;");
		int elemanSayisi = sc.nextInt();
		
		List<String> liste = new ArrayList<String>();		
		Calistir c = new Calistir();
		
		for (int i = 0; i < elemanSayisi; i++) {
			System.out.println((i+1)+". elemaný giriniz");
			c.elemanGir(liste);
		}
		
		System.out.println("Listenin Tüm Elemanlarý");
		
		c.elemanlariDondur(liste);

		System.out.println("Silinecek indisi belirtiniz");
		int indis = sc.nextInt();
		
		c.elemanSil(liste, indis);
		
		System.out.println("Listenin Tüm Elemanlarý");
		
		c.elemanlariDondur(liste);
		
		
	}

}
