
public class Ornek6 {

	public static void main(String[] args) {
	
		for (int i = 1; i < 20; i++) // satýr sayýsý
        {
            for (int j = i; j < 20; j++) //boþluk býrakýr
            {
           	 System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) //yýldýz boþluk
            {
           	 System.out.print("*");
           	 System.out.print(" ");
            }
            System.out.println(" "); //
        }

	}

}
