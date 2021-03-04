package Junits;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestEx {

	@TestFactory
    Collection<DynamicTest> junit1() {
        return Arrays.asList(
          DynamicTest.dynamicTest("Add test",() -> assertEquals(2, Calculator.add(1, 1))),
         
          DynamicTest.dynamicTest("Pallindrome test", () -> assertTrue(StringFunctions.isPallindrome("radar"))));
        

    }
}
