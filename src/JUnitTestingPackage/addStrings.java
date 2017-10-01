package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;


public class addStrings {
	@Test
	public void test() {
		jUnitTesting junitString = new jUnitTesting();
		String result =junitString.addstring("capstone", "project");
		assertEquals("capstoneproject", result);

		
		
	}
	}