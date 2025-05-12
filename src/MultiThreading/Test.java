package MultiThreading;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		//MyThreadDemo t = new MyThreadDemo();
		//t.start();
		//t.start();
		
		RunableDemo r = new RunableDemo();
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		
		t2.start();
		
		//t2.join();
		
		t2.interrupt();
		
		for(int i=0; i<50; i++) {
			System.out.println("Main Thread..");
		}
	}
	
	//t.start() => thread sheduler therad, run() call, new thread vr run() run honar.
	
	//t.run() =>
	
	//Thread.minPriority = 1
	//Thread.normalPriority = 5
	//Thread.maxPriority = 10

}
