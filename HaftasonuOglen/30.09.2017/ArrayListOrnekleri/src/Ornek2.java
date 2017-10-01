import java.util.ArrayList;
import java.util.Scanner;


public class Ornek2 {

	public void elemanEkle(ArrayList<String> liste, String str){
		liste.add(str);
	}
	
	public void elemanlariListele(ArrayList<String> liste){
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
	}

	public static void main(String[] args) {
		Ornek2 o = new Ornek2();
		ArrayList<String> liste = new ArrayList<String>();
		
		System.out.println("Kaç adet eleman girilecek");
		Scanner sc = new Scanner(System.in);
		int elemanSayisi = sc.nextInt();
		
		for (int i = 0; i < elemanSayisi; i++) {
			o.elemanEkle(liste, sc.next());
		}
		
		o.elemanlariListele(liste);
		System.out.println("Kaçýncý indis silinsin ?");
		int indis = sc.nextInt();
		
		liste.remove(indis);
		
		o.elemanlariListele(liste);
		

	}

}
