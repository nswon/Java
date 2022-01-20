package ch01;

class TestThread implements Runnable {

	// Runnable interface use Thread
	@Override
	public void run() {
			int i;
			for(i=1; i<=200; i++) {
				System.out.println(i + "\t");
			}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread() + "start");
		
		TestThread runnable = new TestThread();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + "end");

		Runnable run = new Runnable() {
			
			@Override
			public void run() {

				System.out.println("run");
			}
		};
		
	}

}
