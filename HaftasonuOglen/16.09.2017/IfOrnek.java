
public class IfOrnek {


	public static void main(String[] args) {
		
		
		int sayi = 10;

		if(sayi==10){
			//mant�ksal olarak true d�n�yorsa kod blo�u i�erisine girer
			System.out.println("Say� 10'a e�ittir.");
		}else if(sayi==20){
			System.out.println("Say� 20'ye e�ittir.");
		}else{
			System.out.println("Say� ne 10'a ne de 20'ye e�it de�ildir.");
		}
		
		
		
		String kullanici = "ben";
		String sifre = "1234**";
		
		
		if("ben".equals(kullanici) && "1234**".equals(sifre)){ 
			System.out.println("Kullan�c� ad� ve �ifre do�ru");
		}else{
			System.out.println("Kullan�c� ad� yada �ifresi hatal�");
		}
		
		
		if("ben".equals(kullanici))
			System.out.println("Kullan�c� ad� ben");
		
		if(!"".equals(kullanici))
			System.out.println("Kullan�c� ad� bo� de�ilse");
		
		
		
		int sayi1 = 5;		
		if(sayi1!=5)
			System.out.println("");
		
		
		
		
		

	}
	
	
	

}
