
public class MetotOrnek8 {

	public int uzunluk(String metin){
		int flag = 0;
		for (int i = 0; i < metin.length(); i++) {
			flag++;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		String metin = "PROGRAMM�NG W�TH JAVA";
		
		Ornek8 o = new Ornek8();
		
		System.out.println("Uzunluk: "+o.uzunluk(metin));
		System.out.println("Uzunluk: "+metin.length());

	}

}
