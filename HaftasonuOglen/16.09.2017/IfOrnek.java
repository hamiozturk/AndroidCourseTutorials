
public class IfOrnek {


	public static void main(String[] args) {
		
		
		int sayi = 10;

		if(sayi==10){
			//mantýksal olarak true dönüyorsa kod bloðu içerisine girer
			System.out.println("Sayý 10'a eþittir.");
		}else if(sayi==20){
			System.out.println("Sayý 20'ye eþittir.");
		}else{
			System.out.println("Sayý ne 10'a ne de 20'ye eþit deðildir.");
		}
		
		
		
		String kullanici = "ben";
		String sifre = "1234**";
		
		
		if("ben".equals(kullanici) && "1234**".equals(sifre)){ 
			System.out.println("Kullanýcý adý ve þifre doðru");
		}else{
			System.out.println("Kullanýcý adý yada þifresi hatalý");
		}
		
		
		if("ben".equals(kullanici))
			System.out.println("Kullanýcý adý ben");
		
		if(!"".equals(kullanici))
			System.out.println("Kullanýcý adý boþ deðilse");
		
		
		
		int sayi1 = 5;		
		if(sayi1!=5)
			System.out.println("");
		
		
		
		
		

	}
	
	
	

}
