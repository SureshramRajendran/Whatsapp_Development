package Preparation;

public class UseFuncInt {
	public static void main(String[]args) {
		String[] names= {"Suresh","Ram","jklm","thqs","pqrs"};
		FuncInt f=(n)->{
			for(int i=0;i<n.length;i++) {
				if(!(n[i].contains("a")||n[i].contains("e")||n[i].contains("i")||n[i].contains("o")||n[i].contains("u"))) {
					System.out.println(n[i]);
				}
			}
		};
		f.findVowel(names);
	}

}
