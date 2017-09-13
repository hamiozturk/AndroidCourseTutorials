import java.util.Scanner;


public class Ornek3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for (int i = 0; i < str.length()-2; i++) {
			if("AND".equals(str.substring(i,i+3))){
				System.out.println("AND KELÝMEDE VAR");
			}
		}
		
		if(str.contains("AND")){
			System.out.println("AND KELÝMEDE VAR");
		}

	}

}
