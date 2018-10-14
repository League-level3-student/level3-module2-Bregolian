package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		String[] a = new String[5];
		a[0] = "Why?!";
		a[1] = "I hate this";
		a[2] = "Boo";
		a[3] = "Lame";
		a[4] = "Im done";
		_00_LinearSearch l = new _00_LinearSearch();
		//1. use the assertEquals method to test your linear search method.
		assertEquals(2, l.linearSearch(a, "Boo"));
	}

	@Test
	public void testBinarySearch() {
		String[] a = new String[5];
		a[0] = "Why?!";
		a[1] = "I hate this";
		a[2] = "Boo";
		a[3] = "Lame";
		a[4] = "Im done";
		_00_LinearSearch l = new _00_LinearSearch();
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		assertEquals(2, l.linearSearch(a, "Boo"));
	}
	
	@Test
	public void testInterpolationSearch() {
		String[] a = new String[5];
		a[0] = "Why?!";
		a[1] = "I hate this";
		a[2] = "Boo";
		a[3] = "Lame";
		a[4] = "Im done";
		_00_LinearSearch l = new _00_LinearSearch();
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(2, l.linearSearch(a, "Boo"));
	}
	
	@Test
	public void testExponentialSearch() {
		String[] a = new String[5];
		a[0] = "Why?!";
		a[1] = "I hate this";
		a[2] = "Boo";
		a[3] = "Lame";
		a[4] = "Im done";
		_00_LinearSearch l = new _00_LinearSearch();
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		assertEquals(2, l.linearSearch(a, "Boo"));
	}
}
