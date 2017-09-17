
public class Ornek5 {

	public static void main(String[] args) {
		
		String str1 = "ÝSTEK";
		String str2 = "ÝSMET";
		String str3 = "EKMEK";
		String str4 = "ERKEK";
		String str5 = "MELEK";
		
		String gecici = "";
		
		for (int i = 0; i < str1.length(); i++) {
			/*
			if(i==0){
				gecici = gecici+ str1.charAt(i);
			}else if(i==1){
			    gecici = gecici+ str2.charAt(i);
			}else if(i==2){
			    gecici = gecici+ str3.charAt(i);
			}else if(i==3){
			    gecici = gecici+ str3.charAt(i);
			}else if(i==4){
			    gecici = gecici+ str3.charAt(i);
			}
			*/
			
			switch (i) {
			case 0:
				gecici = gecici+ str1.charAt(i);
				break;
			case 1:
				gecici = gecici+ str2.charAt(i);		
				break;
			case 2:
				gecici = gecici+ str3.charAt(i);
				break;
			case 3:
				gecici = gecici+ str3.charAt(i);
				break;
			case 4:
				gecici = gecici+ str3.charAt(i);
				break;
			
			}
		
		
	}
	System.out.println(gecici);
		
		
		

	}

}
