
public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread1 obj1 = new Thread1();
		Thread2 obj2 = new Thread2();
		
		obj1.start();
		try {
		Thread.sleep(10);	
		}
		catch(Exception e) {
			
		}
		obj2.start();
	}

}
