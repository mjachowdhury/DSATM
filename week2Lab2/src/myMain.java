
public class myMain {

	// --------------------------------------------------
	// reverse
	// --------------------------------------------------
	/**
	 * 
	 * The function reverses a String.
	 * 
	 * @param s:
	 *            String to be scanned.
	 * @return A new String, whose content is the reverse of the input one.
	 * 
	 */
	/*
	 * public static String reverse(String s){
	 * 
	 * String reverse = ""; int length = s.length(); for(int i = length -1; i >=
	 * 0; i--){ reverse = reverse + s.charAt(i); } return reverse; }
	 */

	public static String reverse(String s) {
		String reverse = s;
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		return reverse;
	}

	// --------------------------------------------------
	// isPalindrome
	// --------------------------------------------------
	/**
	 * 
	 * The function checks if a String is a palindrome.
	 * 
	 * @param s:
	 *            String to be scanned.
	 * @return If the String is a palindrome or not.
	 * 
	 */
	public static boolean isPalindrome(String s) {

		/*
		 * int original = 0; int reverse = s.length() -1; while(reverse >
		 * original){ if(s != reverse){ return false; } ++ original; -- reverse;
		 * } return true;
		 */
		/*
		 * int n = s.length(); for(int i = 0; i< n/2; i++){ if(s.charAt(i) !=
		 * s.charAt(n - i -1)){ return false; } return true; }
		 */
		return s.equals(new StringBuffer().append(s).reverse().toString());

	}

	// --------------------------------------------------
	// charAppearingTheMost
	// --------------------------------------------------
	/**
	 * 
	 * The function scans a String to get the character appearing the most on
	 * it.
	 * 
	 * @param s:
	 *            String to be scanned
	 * @return The character appearing the most in the String.
	 * 
	 */
	public static char charAppearingTheMost(String s) {
		
		 
		

		/*int count = 1;
		int max = 1;
		char maxChar = s.charAt(1);

		for (int i = 1; i < s.length(); i++) {
			count = (s.charAt(i) == s.charAt(i - 1)) ? (count + 1) : 1;
			if (count > max) {
				max = count;
				maxChar = s.charAt(i);
			}
		}

		return  maxChar;*/

		
		int count = 0, maxCount = 0;
		char result = '/';
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1))
				maxCount++;

			if (maxCount > count) {
				result = s.charAt(i);
				count = maxCount;
			}
			if (s.charAt(i) != s.charAt(i))
				maxCount = 0;
			if (count == 0 && maxCount == 0)
				result = s.charAt(i);
		}
		return result;
		 
	}

	// --------------------------------------------------
	// MAIN
	// --------------------------------------------------
	/**
	 * 
	 * Main Method: Used to test the 3 algorithms.
	 * 
	 * @param args:
	 *            We will run the program parameter free, so do not worry about
	 *            it.
	 * 
	 */
	public static void main(String[] args) {
		// i) Collect the program input arguments
		String arg = "mumy";
		String arg2 = "Good Morning";
		String arg3 = " ddddder";

		// Call to the main function of the application we want to deal with
		// 1. Reverse the String
		String res1 = reverse(arg);
		System.out.println(res1);

		// 2. Check if the String is a palindrome
		boolean res2 = isPalindrome(arg);
		System.out.println(res2);

		boolean res3 = isPalindrome(arg2);
		System.out.println(res3);

		// 3. Count the character appearing the most in the String
		char res4 = charAppearingTheMost(arg3);
		System.out.println("Maximum occuring char is : " + res4);
	}

}
