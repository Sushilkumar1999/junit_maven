package Junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public interface DefaultInterface {
	
	@Test
	default void StringPallindrome() {
     
		boolean flag = StringFunctions.isPallindrome("radar");
		boolean flag1 = StringFunctions.isPallindrome("abba");
		
		assertTrue(flag);
		assertTrue(flag1);
		System.out.println("Inside the interface");
	}

}
