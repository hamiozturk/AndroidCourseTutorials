
public class Ornek2 {

	public static void main(String[] args) {
		
		// 0'dan ba�la 100'e kadar git
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		
		System.out.println("---");
		
		// 100'den ba�la, 0'a kadar git
		for(int i = 100; i>0; i--){
			System.out.println(i);
		}
		
		System.out.println("---");
		
		// 100'den ba�la, 5'er 5'er azalarak 0'a kadar git
		for(int i = 100; i>0; i-=5){
			System.out.println(i);
		}
		
		System.out.println("---");
		
		// 0'dan ba�la, 5'er 5'er artarak 100'e kadar git
		for (int i = 0; i <= 100; i+=5) {
			System.out.println(i);
		}
		
		
		

	}

}
