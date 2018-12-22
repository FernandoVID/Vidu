
public class HelloWorld {

	public static void main(String args[]) {
		while(true) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long number = System.nanoTime() ;
		
		System.err.println(number * System.nanoTime());
		}
	}
	
}
