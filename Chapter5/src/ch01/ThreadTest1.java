package ch01;

class MyThread extends Thread {
	
	// extends use Thread
	public void run() {
		int i;
		for(i=1; i<=200; i++) {
			System.out.println(i + "\t");
		}
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread() + "start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start(); //thread start
		th2.start();

		System.out.println(Thread.currentThread() + "end");

	}

}
