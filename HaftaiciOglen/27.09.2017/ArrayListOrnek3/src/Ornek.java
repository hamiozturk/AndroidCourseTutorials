import java.util.ArrayList;


public class Ornek {


	public static void main(String[] args) {
	
		ArrayList liste = new ArrayList();
		liste.add(4);
		liste.add(true);
		liste.add("android");
		
		//ELEMANLARI YAZDIR
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
		//LÝSTEYÝ TEMÝZLE
		liste.clear();
		
		//LÝSTE BOÞ MU ?
		System.out.println(liste.isEmpty());
		
		
	}

}
