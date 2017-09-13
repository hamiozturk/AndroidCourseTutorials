
public class Ornek3 {


	public static void main(String[] args) {
		String str = "MERHABA DÜNYA";
		String gecici = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!='A'){
				gecici = gecici + str.charAt(i);
			}
		}
		System.out.println(gecici);

	}

}
