package MultiThreading;

public class MyThreadDemo extends Thread {

	@Override
	public void run() {		
		for(int i=0; i<50; i++) {
			System.out.println("Child Thread..");
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void run(int n) {
		System.out.println("overloded run method..");
	}
	
	

}
