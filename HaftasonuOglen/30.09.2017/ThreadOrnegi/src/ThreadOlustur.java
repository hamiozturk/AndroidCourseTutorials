
public class ThreadOlustur extends Thread {
	
	private int SURE = 5;
	
	public void run(){
		
			try {
				Thread.sleep(SURE*1000);
				System.out.println("Thread �al��t�");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	
}
