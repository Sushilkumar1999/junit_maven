package Junits;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Repeatedtest {
	
	
	@DisplayName("Example for repeated test")
	@RepeatedTest(4)
	public void junit1() {
		System.out.println("inside junit");
	}

}
