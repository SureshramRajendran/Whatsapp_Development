package Preparation;

public class Immutable {
	public static void main(String[]args) {
		String name="Suresh";
		String name1=new String("Suresh");
		String name2="Suresh";
		StringBuffer name3=new StringBuffer("Ram");
		StringBuilder name4=new StringBuilder("Suresh");
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.err.println(name==name1);
		System.out.println(name==name2);
		System.out.println(name.equals(name3));
		System.out.println(name3.append("Jerry").reverse().hashCode());
		System.out.println(name3.append(name));
		System.out.println(name3.reverse());
		System.out.println(name4.append(name3));
	    System.out.println(name4.reverse());
		System.out.println(name4.append("Ram").reverse().hashCode());
		System.out.println("************");
		 
		String temp="";
		for(int i=name.length()-1;i>=0;i--) {
			temp=temp+name.charAt(i);
		}
		System.out.println(temp);
		System.out.println("***********");
		System.out.println(name);
		String a="12345";
		System.out.println(a.toUpperCase());
		

	}

}
