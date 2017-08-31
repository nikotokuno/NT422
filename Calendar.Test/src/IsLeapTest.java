import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IsLeapTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isLeapYearTest() {
		
		// Arrange
		int year1 = 2012, year3 = 1992, year4 = 1996, year5 = 2000;
		
		// Act
		Object resultLeap1 = toTest.Date.isLeap(year1);
		Object resultLeap2 = toTest.Date.isLeap(year3);
		Object resultLeap3 = toTest.Date.isLeap(year4);
		Object resultLeap4 = toTest.Date.isLeap(year5);
		
		// Assert
		assertEquals("result should be true since 2012 is divisible by 4", true, resultLeap1);	
		assertEquals("result should be true since 1996 is divisible by 4", true, resultLeap2);	
		assertEquals("result should be true since 1996 is divisible by 4", true, resultLeap3);		
		assertEquals("result should be true since 2000 is divisible by 4", true, resultLeap4);
	}
	
	@Test
	public void isCenturyLeapYearTest() {
		
		// Arrange
		int tempYear1 = 2000, tempYear2 = 4000;
		
		// Act
		Object resultCentYear1 = toTest.Date.isLeap(tempYear1);
		Object resultCentYear2 = toTest.Date.isLeap(tempYear2);
		
		// Assert
		assertEquals("result should be true since 2000 is divisible by 400 and 4", true, resultCentYear1);
		assertEquals("result should be true since 4000 is divisible by 400 but not 4", true, resultCentYear2);
	}
	
	@Test
	public void isNotLeapYearTest() {
		
		// Arrange
		int tempYear1 = 2001, teampYear2 = 1993;
		
		// Act
		Object resultNotLeapYear1 = toTest.Date.isLeap(tempYear1);
		Object resultNotLeapYear2 = toTest.Date.isLeap(teampYear2);
		
		// Assert
		assertEquals("result should be false since 2001 is not a leap year", false, resultNotLeapYear1);
		assertEquals("result should be false since 1993 is not a leap year", false, resultNotLeapYear2);
	}
	
	@Test
	public void isNotCenturyLeapYearTest() {
		
		// Arrange
		int tempYear1 = 1961, tempYear2 = 1917;
		
		// Act
		Object resultNotCenturyLeapYear1 = toTest.Date.isLeap(tempYear1);
		Object resultNotCenturyLeapYear2 = toTest.Date.isLeap(tempYear2);
		
		// Assert
		assertEquals("result should be false since 1961 is not a century leap year", false, resultNotCenturyLeapYear1);
		assertEquals("result should be false since 1917 is not a century leap year", false, resultNotCenturyLeapYear2);
	}

}
