
public class C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		A a = new A();
		B b = new B();
		
		Thread thread = new Thread(a);
		Thread thread2 = new Thread(b);
		thread.setPriority(2);
		thread2.setPriority(1);
		thread.start();
		thread2.start();
		

	}

}
