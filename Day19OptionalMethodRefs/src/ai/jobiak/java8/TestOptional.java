package ai.jobiak.java8;

import java.util.Optional;

public class TestOptional {

	static void method(String input) {
		if(input !=null) {
			System.out.println(input.length());
		}
	}
	public static void main(String[] args) {
		String str=null;
		String str2=new String("hello");
	//	Optional optional=Optional.of(str); //throws NullPointerException
	//  System.out.println(optional.get());
	
	//	Optional optional=Optional.of(str2);
	//	System.out.println(optional.get());
		
	//	Optional optional=Optional.ofNullable(str); //NoSuchElementException
	//	System.out.println(optional.get());
		
	//	Optional optional=Optional.ofNullable(str2);
	//	System.out.println(optional.get()); 
		
	//	Optional optional=Optional.ofNullable(str);  //Exception is not thrown NoSuchElementException
		//	if(optional.isPresent()) {
			//	System.out.println(optional.get());
		//	}
		Optional optional=Optional.ofNullable(str);
		System.out.println(optional.orElse("Alternate String")); 
		
		Optional optional1=Optional.ofNullable(str2);
		System.out.println(optional1.orElse("Alternate String")); 
	}

}
