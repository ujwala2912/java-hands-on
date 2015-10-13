package handsOn1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class subjectsTest {

	Calculator cal;

	@Before
	public void setup() {
		cal = new Calculator();
	}

	@Test
	public void test() {

		int result = cal.add(2, 2);
		assertEquals(result, 4);

		result = cal.add(5, 6);
		assertEquals(result, 11);
	}

	@Test
	public void testDivision() {
		Calculator cal = new Calculator();

		int result = cal.divide(2, 2);
		assertEquals(result, 4);

	}

}
