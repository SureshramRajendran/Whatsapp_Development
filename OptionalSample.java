package Preparation;

import java.util.Optional;

public class OptionalSample {
	public static void main(String[]args) {
		String word=null;
//		Optional<String> a=Optional.of(word);
		Optional<String> b=Optional.ofNullable(word);
		if(b.isPresent()) {
			System.out.println(word.toUpperCase());
		}
		else {
			System.out.println("It is Null");
		}
//		System.out.println(b.orElse("It is Empty or Null"));
	}

}
