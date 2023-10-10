package Preparation;

public class SampleThread implements Runnable{
	public void run() {
		synchronized (SampleThread.class) {
			try {
				System.out.println("I'm Waiting Thread");
				SampleThread.class.wait(20000);
				System.out.println("Thread is Started Driving");
			}
			catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
		}
	}


public static void main(String[]args) {
	SampleThread st=new SampleThread();
	Thread t=new Thread(st);
	t.start();
	try {
		Thread.sleep(50000);
	}
	catch (InterruptedException ie) {
		ie.printStackTrace();
	}
	synchronized (t) {
	t.notify();	
	}
	System.out.println("Hello Thready");

	}
}
	
