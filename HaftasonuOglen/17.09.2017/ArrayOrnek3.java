import java.util.Scanner;


public class ArrayOrnek3 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int uzunluk = sc.nextInt();
		char[] ch = new char[uzunluk];
		
		for (int i = 0; i < uzunluk; i++) {
			ch[i] = sc.next().charAt(0);
		}
		System.out.println("---");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		

	}

}
