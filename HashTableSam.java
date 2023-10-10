package Preparation;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableSam {
	public static void main(String[]args) {
		
		HashMap<Integer, String> hm=new HashMap<>(19);
		hm.put(100, "Suresh");
		hm.put(50, "Ram");
		hm.put(75, "Kumar");
		hm.put(298, "Raj");
		hm.put(153, "Mathan");
		hm.put(189, "RajKumar");
		hm.put(200,"Suresh");
		hm.put(153,"Mathan");
		hm.put(null, "Kavi");
		
		System.out.println(hm);
		
		Hashtable<Integer, String> ht=new Hashtable<>(19);
		ht.put(100, "Suresh");
		ht.put(50, "Ram");
		ht.put(75, "Kumar");
		ht.put(298, "Raj");
		ht.put(153, "Mathan");
		ht.put(189, "RajKumar");
		ht.put(200,"Suresh");
		ht.put(153,"Mathan");
		ht.put(505, "Kavi");
ht.forEach((x,y) -> System.out.println(x.hashCode()%19+","+y));
	
	System.out.println(ht);
	}
	

}
