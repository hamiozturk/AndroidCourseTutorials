
public class ThreadSinifi extends Thread {

	private String[] dizi;
	
	public ThreadSinifi(String[] dizi){
		this.dizi = dizi;
	}
	
	public void run(){
		try {
			for (int i = 0; i < dizi.length; i++) {
				System.out.println(dizi[i]);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
