package Preparation;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Hasmp {
	public static void main(String[]args) {
		
		Map<Integer, String> h=new ConcurrentHashMap<>();
		h.put(115, "Ram");
		h.put(822, "Chain");
		h.put(876, "Kumar");
		
		for(String i:h.values()) {
			h.put(324, "Mathan");
			System.out.println(i);
		}
		System.out.println(h);
	}

}
