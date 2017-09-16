import java.text.SimpleDateFormat;
import java.util.Date;


public class TarihFormati {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
			Date date = new Date();
			
			SimpleDateFormat df =
					new SimpleDateFormat("dd/MM/Y HH:mm:ss");
			System.out.println(df.format(date));
		
		

	}

}
