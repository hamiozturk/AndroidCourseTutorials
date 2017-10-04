
public class B implements Runnable {

	public B(){}
	
	public void run(){
		while(true){
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				
			}
			System.out.println("B.java class'ý içerisindeyim.");
		}
	}
	
}
