import java.util.Scanner;


public class Ornek4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		/*
		for (int i = 0; i < str.length()-2; i++) {			
			if("�LE".equals(str.substring(i, i+3))){
				System.out.println("�LE KEL�MES�N� BULDUM");
			}			
		}
		*/
		
		for (int i = 0; i < str.length()-1; i++) {
			System.out.println(str.substring(i,i+2));
		}

	}

}
