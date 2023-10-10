package Preparation;

import java.util.Arrays;
import java.util.List;

public class ConvertionArrayToList {
	public static void main(String[]args) {
		
		String[] words= {"Tom","Cat","Mouse","Jerry","Spike","Dog"};

		List<String> l=Arrays.asList(words);
	
		System.out.println(l);
		
		String[] s= l.toArray(new String[l.size()]);
		
		for(String r:s) {
			System.out.println(r);
		}
		
		
	}

}
