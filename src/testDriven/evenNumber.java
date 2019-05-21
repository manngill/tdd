import static org.junit.Assert.*;

import org.junit.Test;

public class evenNumber {

	/* function isEven(n) {}
	 * Accepts 1 integer value, n
	 * 
	 * R1. If n is even, return true
	 * R2. If n is odd, return false
	 * R3. If N < 1, then return false
	 * R4. N must be > 1
	 */
	@Test
	public void testEvenNumber() {
		evenNumber x = new evenNumber();
		boolean actualOutput = x.isEven(2000);
		assertEquals(true, actualOutput);
	}

	// R2: If n is odd, return false
	public void testOddNumber() {
		evenNumber x = new evenNumber();
		boolean actualOutput = x.isEven(3);
		assertEquals(false, actualOutput);
	}
}

