import java.util.Random;


public class MetotOrnek6 {

	public int rastgeleSayiUret(int enBuyukSayi){
		Random rnd = new Random();
		int uretilen = rnd.nextInt(enBuyukSayi);
		return uretilen;
	}
	
	
	public static void main(String[] args) {
		
		MetotOrnek6 o = new MetotOrnek6();
		int ilkSayi = o.rastgeleSayiUret(5);
		int ikinciSayi = o.rastgeleSayiUret(5);
		
		if(ilkSayi>ikinciSayi){
			System.out.println("�lk say� b�y�kt�r. "+"Say�1="+ilkSayi+" "+"Say�2="+ikinciSayi);
		}else if(ikinciSayi>ilkSayi){
			System.out.println("�kinci say� b�y�kt�r. "+"Say�1="+ilkSayi+" "+"Say�2="+ikinciSayi);
		}else{
			System.out.println("Say�lar e�ittir. "+ilkSayi);
		}

	}

}
