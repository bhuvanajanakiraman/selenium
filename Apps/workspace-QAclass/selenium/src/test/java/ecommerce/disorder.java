package ecommerce;

public class disorder{

	public static void disorder(String str) {
		// split string into 3 parts
		// from 0 to end of 1st part
		// do swapping
		// from beginning of 2nd part to end of 2nd part
		// do swapping

		char[] c = str.toCharArray();
		int midPoint = c.length / 2;
		System.out.println(midPoint);
		int j =midPoint;
		for (int i = 0; i < j; i++) {
			char temp = c[i];
			c[i] = c[j - 1];
			c[j - 1] = temp;
			j--;
		}

		int k = c.length-1;
		for (int i = midPoint+1; i <= k; i++) {
			char temp = c[i];
			c[i] = c[k];
			c[k] = temp;
			k--;
		}
		System.out.println(c);

	}

	/**
	 * W A L M A R T
	 * 
	 * Midpoint = M
	 * 
	 * L A W M A R T
	 * midpoint = 3
	 * 
	 */

	public static void main(String[] args) {
		disorder.disorder("walmart");
	}
}
