
/**
 * Imports section: Import the random library for ex3
 */
import java.util.Random;

/**
 * The class contains the 8 methods to fulfill in the exam.
 * 
 * @author M J Chowdhury
 *
 */
public class exercises {

	// ----------------------------------------------
	// Class constructor
	// ----------------------------------------------
	/**
	 * Constructor of the class. Do not edit it.
	 */
	public exercises() {
	}

	// ----------------------------------------------
	// ex1
	// ----------------------------------------------
	/**
	 * The function prints your name by the screen.<br>
	 * Example: In my case it will print Triona McSweeney
	 */
	public void ex1() {
		System.out.println("Your name is M J  A Chowdhury.");
	}

	// ----------------------------------------------
	// ex2
	// ----------------------------------------------
	/**
	 * The function declares a new variable res, assigns it to the sum of 'a'
	 * and 'b' and returns res.<br>
	 * Example: If a = 3 and b = 5 then it returns 8 (which is 3 + 5)
	 * 
	 * @param a:
	 *            First Integer
	 * @param b:
	 *            Second Integer
	 * @return Sum of a and b
	 */
	public int ex2(int a, int b) {
		int result;
		result = a + b;
		return result;
	}

	// ----------------------------------------------
	// ex3
	// ----------------------------------------------
	/**
	 * The function receives 3 numbers and prints by screen the biggest of
	 * them.<br>
	 * Example: If a = 3, b = 7 and c = 5, then it prints 7 (which is the
	 * biggest of the 3 numbers).
	 * 
	 * @param a:
	 *            First number
	 * @param b:
	 *            Second number
	 * @param c:
	 *            Third number
	 * 
	 */
	public void ex3(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("A is the greater :" + a);
		} else if (b > a && b > c) {
			System.out.println("Number B is the greater :" + b);
		} else if (c > a && c > b) {
			System.out.println("Number C is the greater :" + c);
		} else {
			System.out.println("All the number are equal.");
		}
	}

	// ----------------------------------------------
	// ex4
	// ----------------------------------------------
	/**
	 * The function returns the sum of all numbers from 1 to n.<br>
	 * Example: If n = 5, the function returns 15 (which is 1 + 2 + 3 + 4 + 5).
	 * 
	 * @param n:
	 *            Number we want to stop adding at
	 * @return Sum of all integers in [1..n]
	 * 
	 */
	public int ex4(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result = result + i;
		}
		return result;
	}

	// ----------------------------------------------
	// ex5
	// ----------------------------------------------
	/**
	 * The function prints a pattern by screen.<br>
	 * Example1: If n = 3, then it prints<br>
	 * *<br>
	 * **<br>
	 * ***<br>
	 * Example2: If n = 5, then it prints<br>
	 * *<br>
	 * **<br>
	 * ***<br>
	 * ****<br>
	 * *****<br>
	 * 
	 * @param n:
	 *            Number of lines to be printed
	 * 
	 */
	public void ex5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	// --------------------------------------------------
	// ex6
	// --------------------------------------------------
	/**
	 * 
	 * The function reverses a String and returns the String reversed.<br>
	 * Example: If the String "Hello" is received, then it returns "olleH"
	 * 
	 * @param s:
	 *            String to be scanned.
	 * @return The reversed String.
	 * 
	 */
	public String ex6(String s) {
		/*
		 * String string = s; String reverseWord = new
		 * StringBuilder(string).reverse().toString(); return reverseWord;
		 */

		char[] in = s.toCharArray();
		int begin = 0;
		int end = in.length - 1;
		char temp;
		while (end > begin) {
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		return new String(in);
	}

	// ----------------------------------------------
	// ex7
	// ----------------------------------------------
	/**
	 * NOTE: This exercise has been taken from CodeWars:<br>
	 * https://www.codewars.com/kata/sum-of-digits-slash-digital-root<br>
	 * Description:<br>
	 * A digital root is the recursive sum of all the digits in a number.<br>
	 * Given n, take the sum of the digits of n.<br>
	 * If that value has still more than one digit, continue reducing in this
	 * way until a single-digit number is produced.<br>
	 * <br>
	 * Example 1:<br>
	 * ex7(16)<br>
	 * 1 + 6<br>
	 * 7<br>
	 * <br>
	 * 
	 * Example 2:<br>
	 * ex7(942)<br>
	 * 9 + 4 + 2<br>
	 * 15<br>
	 * However, as 15 still contains more than one digit, we iterate again<br>
	 * 1 + 5<br>
	 * 6
	 * 
	 * @param n:
	 *            Number to apply its digital root to.
	 * @return res: Digital result of the number.
	 */

	public int ex7(int n) {
		/*
		 if(n < 10 ){ 
			 return n; 
			 } 
		 return ex7(n % 10 + ex7(n / 10 )); 
		 }*/
		
		if(n==0) 
	        return 0;
	    if(n%9 == 0) 
	        return 9;
	    return n%9;
		 

		/*if (n > 10) {
			int sum = n % 10 + ex7(n / 10);
			if (sum > 10) {
				return ex7(sum);
			} else {
				return sum;
			}

		} else {
			return n;
		}
	}*/
	
	/*int num = n;
	int add=0;
	while(num % 10 > 0 ){
		add = (num % 10) + add;
		num = num/10;
		//System.out.println("Number is :" +num);
	}
	if(add/10>0){
		System.out.println(add);
		return ex7(add);
	}
	return add;
}*/
}
}
