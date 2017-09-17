import java.util.Scanner;


public class ArrayOrnek7 {

	public static void main(String[] args) {
		
		//SORTÝNG SELECTÝON ALGORÝTHM
		
		Scanner scanner = new Scanner(System.in);
		int[] dizi = new int[5];
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = scanner.nextInt();
		}
		
		int temp = 0;
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i+1; j < dizi.length; j++) {
				if(dizi[i]>dizi[j]){
					temp = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = temp;
				}
				//System.out.println(""+dizi[j]);
			}
		}
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}

	}

}
