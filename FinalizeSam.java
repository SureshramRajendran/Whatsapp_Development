package Preparation;

public class FinalizeSam {
	public void finalize() {
		System.out.println("Collected da dappa");
	}
	public static void main(String[]args) {
		FinalizeSam fs1=new FinalizeSam();
		System.out.println(fs1.hashCode());
		fs1=new FinalizeSam();
		System.gc();
	}

}
