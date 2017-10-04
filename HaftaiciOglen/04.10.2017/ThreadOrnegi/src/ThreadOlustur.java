import java.util.ArrayList;

public class ThreadOlustur extends Thread {
	
	private static long SLEEP_TIME = 5;
	private ArrayList<String> liste;
	
	public ThreadOlustur(int SLEEP_TIME,ArrayList<String> liste){
		this.SLEEP_TIME = SLEEP_TIME;
		this.liste = liste;
	}
	
	public void run(){
		
		try{
			for (int i = 0; i < liste.size(); i++) {
				System.out.println(liste.get(i));
				Thread.sleep(SLEEP_TIME*1000);
			}
		}catch(Exception e){
			System.out.println("HATA:"+e.getMessage());
		}
		
	}

}
