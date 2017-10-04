
public class A implements Runnable {
	
	public A(){}
	
	public void run(){
		while(true){
			try{
				Thread.sleep(3000);
			}catch(Exception e){
				
			}
			System.out.println("A.java class'ý içerisindeyim.");
		}
	}

}
