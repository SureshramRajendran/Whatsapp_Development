package Preparation;

import Java8.MethRef;

public class UseArithMethod {
	public static void main(String[]args) {
	int[] nums= {12,32,34,43,55,56,77,87,98,100};
	MethRef m=new MethRef();
	ArithMethod mr=m::getEven;
	mr.getEven(nums);
	
	System.out.println("********");
	
	String name="suresh";
	MethRef r=new MethRef();
	MethString ms=r::upperCase;
	ms.upperCase(name);
	
	System.out.println("********");
	
	String[] names= {"suresh","ram","Madhan","raj","jd","jerry"};
	MethRef ref=new MethRef();
	MinString mins=ref::minString;
	mins.minString(names);
	
	
	}

}
