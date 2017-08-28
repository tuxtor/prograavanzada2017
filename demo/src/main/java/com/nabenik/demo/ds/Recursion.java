package com.nabenik.demo.ds;

/**
 * Demo implementation of classic recursions
 * 
 * @author tuxtor
 *
 */
public class Recursion {

	/**
	 * Single recursion method for factorial implementation
	 * 
	 * @param n
	 *            n! parameter
	 * @return Result of n!
	 */
	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public static int binarySum(int data[], int start, int end) {
		if (start > end)
			return 0;
		else if (start == end)
			return data[start];
		else {
			int mid = (end - start) / 2;
			return binarySum(data, start, mid) + binarySum(data, mid + 1, end);
		}
	}

}
