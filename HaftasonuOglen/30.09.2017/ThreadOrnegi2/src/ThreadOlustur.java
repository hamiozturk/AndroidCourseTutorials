import java.util.ArrayList;


public class ThreadOlustur extends Thread {
	
	private ArrayList<String> list;
	private int SLEEP_TIME = 0;
	
	public ThreadOlustur(){
		
	}
	
	public ThreadOlustur(int SLEEP_TIME, ArrayList<String> liste){
		this.list = liste;
		this.SLEEP_TIME = SLEEP_TIME;
	}
	
	public void run(){
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(this.getName()+ " > " + list.get(i));
			try {
				Thread.sleep(SLEEP_TIME*1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
 
}
