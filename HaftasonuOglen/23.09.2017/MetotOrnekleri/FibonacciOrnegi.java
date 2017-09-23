
public class FibonacciOrnegi {

	public static int[] fibonacciArray(int sayi){
		int[] dizi = new int[sayi];
		int n1=0,n2=1,n3;    
		   
		dizi[0]=0;
		dizi[1]=1;
		
		for(int i=2;i<sayi;++i){    
			n3=n1+n2;    
			dizi[i]=n3;  
			n1=n2;    
			n2=n3;    
		}  
		
		return dizi;
	}
	public static void main(String[] args) {
		int[] dizi = fibonacciArray(20);
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
	}

}
