package handsOn1;

import static org.junit.Assert.*;

import org.junit.After;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

public class calculateGradesTest {

	 calculateGrades c = null;
	 subjects s = null;

	@Before
	public void setBefore() {
		System.out.println("From Before block");
		c = new calculateGrades();
		s = new subjects();
		s.setMathematicsMarks(100);
		s.setHindiMarks(100);
		s.setScienceMarks(100);
		s.setSocialMarks(100);
		s.setEnglishMarks(100);
	}

	@Test
	public void testCheckMarks() {

		System.out.println("checking checkMarks");
		assertEquals(s.checkMarks(23), true);
		assertEquals(s.checkMarks(23), false);
	}

	@Test
	public void testCheckPercentage() {

		System.out.println("checking percentage");
		assertEquals(s.calculatePercentage(), 100, 0.01);

	}

	@Test
	public void testCheckGrade() {
		System.out.println("checking grades");
		assertEquals(s.getGrade(), "Excellent");
	}

	@After
	public void setAfter() {
		System.out.println("From After Test");
	}

}
