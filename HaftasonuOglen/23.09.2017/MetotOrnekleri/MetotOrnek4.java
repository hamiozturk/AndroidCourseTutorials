
public class MetotOrnek4 {
	
	public static String buyukKucukYaz(String yazi){
		String geciciMetin = "";
		char karakter;
		
		for (int i = 0; i < yazi.length(); i++) {
			if(i%2==0){
				karakter = yazi.charAt(i);
				geciciMetin = geciciMetin + String.valueOf(karakter).toLowerCase();
			}else{
				karakter = yazi.charAt(i);
				geciciMetin = geciciMetin + String.valueOf(karakter).toUpperCase();
			}			
		}
		
		return geciciMetin;
	}

	public static void main(String[] args) {
		System.out.println(buyukKucukYaz("ANDROÝDSINIFI"));
		System.out.println(buyukKucukYaz("IOSSINIFI"));
	}

}
