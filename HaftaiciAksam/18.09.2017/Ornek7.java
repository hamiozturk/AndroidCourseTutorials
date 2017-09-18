import java.util.Scanner;


public class Ornek7 {

	public static void main(String[] args) {
		/* 
		 DI�ARIDAN G�R�LENLER�N STR�NG VE �NT OLUP OLMADIKLARINI TESP�T ED�L
		 SAYI �SE SAYI D�Z�S�NE, MET�N �SE STR�NG D�Z�S�NE ATAMA �RNE��
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ka� adet veri gireceksiniz ?");
		int sayi = sc.nextInt();
		
		int[] intDizi = new int[sayi];
		String[] strDizi = new String[sayi];
		
		String numerik = "0123456789";
		
		
		for (int i = 0; i < sayi; i++) {
			
			String geciciDeger = sc.next();
			int flag = 0;
			
			for (int j = 0; j < geciciDeger.length(); j++) {
				
				for (int k = 0; k < numerik.length(); k++) {
					
					if(geciciDeger.charAt(j) == numerik.charAt(k)){
						flag++;
					}
				}
			}
			
			if(flag == geciciDeger.length()){
				intDizi[i] = Integer.parseInt(geciciDeger);
			}else{
				strDizi[i] = geciciDeger;
			}
			
			flag = 0;
			geciciDeger = "";

		}
		
		
		System.out.println("�NT D�Z�S�");
		for (int i = 0; i < intDizi.length; i++) {
			System.out.println(intDizi[i]);
		}
		
		System.out.println("STR D�Z�S�");
		for (int i = 0; i < strDizi.length; i++) {
			System.out.println(strDizi[i]);
		}
		
		

	}

}
