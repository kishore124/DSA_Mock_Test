package in.ineuron;

/**
 * Given a non-negative integer x, return the square root of x rounded down to
 * the nearest integer. The returned integer should be non-negative as well. You
 * must not use any built-in exponent function or operator.
 * 
 * Example 1: Input: x = 4 Output: 2 Explanation: The square root of 4 is 2, so
 * we return 2. Example 2:
 * 
 * Input: x = 8 Output: 2 Explanation: The square root of 8 is 2.82842..., and
 * since we round it down to the nearest integer, 2 is returned. Constraints:
 * 
 * 0 <= x <= 231 - 1
 */
public class SquareRoot {

	public static void main(String[] args) {

		int n = 5;
		int res = sqtRoot(n);

		System.out.println("Result is " + res);
	}

	public static int sqtRoot(int n) {

		int start = 1;
		int end = n;
		int res = 0;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (mid * mid == n)
				return mid;
			else if (mid * mid < n) {
				start = mid + 1;
				res = mid;
			} else {
				end = mid - 1;
			}
		}
		return res;
	}
}
