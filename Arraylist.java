package Preparation;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arraylist {
	public static void main(String[]args) {

		List<String> l=new CopyOnWriteArrayList<>();
		
		l.add("Tom");
		l.add("Cat");
		l.add("Jerry");
		l.add("Dog");
		l.add("Spike");
		
		for(String s:l) {
		System.out.println(s);
			l.remove("Dog");
		
		}
		System.out.println(l);
		
		List<Integer> r=new CopyOnWriteArrayList<>();
		r.add(673);
		r.add(367);
		r.add(873);
		r.add(473);
		r.add(983);
		for(Integer i:r) {
			if(i==473) {
				r.remove(3);	
			}
			System.out.println(r);
		}
		System.out.println(r);
		System.out.println("End this Program");
		
	}

}
