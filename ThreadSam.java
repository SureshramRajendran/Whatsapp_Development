package Preparation;

public class ThreadSam implements Runnable{
	public void run() {
		System.out.println("Hello Thread");
	}
	public static void main(String[]args) {
		ThreadSam ts=new ThreadSam();
		Thread t=new Thread(ts);
		t.start();
		System.out.println("Main Thread");
	}

}
