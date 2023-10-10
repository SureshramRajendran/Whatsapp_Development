package Preparation;

public class StaticSample {
	public static void main(String[]args) {
		StaticSample ss1=new StaticSample();
		StaticSample ss2=new StaticSample();
		StaticSample ss3=new StaticSample();
		System.out.println(StaticSample.display());
		System.out.println(StaticSample.a);
		System.out.println(ss1.display());
		System.out.println(ss2.a);
		System.out.println(ss3.a);
		System.out.println(ss1.a);
		System.out.println(StaticSample.a);
		
	}
	public static String display() {
		return "Hello Suresh";
	}
	static int a=25;
	static {
		System.out.println("Welcome Static Suresh");
	}
	public StaticSample() {
		a++;
		System.out.println(a);
	}

}
