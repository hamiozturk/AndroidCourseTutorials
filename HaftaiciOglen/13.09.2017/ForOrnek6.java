
public class Ornek6 {

	public static void main(String[] args) {
	
		for (int i = 1; i < 20; i++) // sat�r say�s�
        {
            for (int j = i; j < 20; j++) //bo�luk b�rak�r
            {
           	 System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) //y�ld�z bo�luk
            {
           	 System.out.print("*");
           	 System.out.print(" ");
            }
            System.out.println(" "); //
        }

	}

}
