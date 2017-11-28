package hintThree;

/**
 * Class: ChangeMaking
 * This class implements a greedy algorithm for solving the change making problem.
 */

public class ChangeMaking {
	/**
	 * Method: testChangeMaking
	 * 
	 * Tests and compares the algorithm for making change.
	 */
	public static void testChangeMaking() {

		int[] denoms = new int[4];

		// possible changes of coins
		denoms[0] = 20; // coin of value 20
		denoms[1] = 10; // coin of value 10
		denoms[2] = 5; // coin of value 5
		denoms[3] = 1; // coin of value 1

		int val1 = 0; // maximum amount of money
		int val2 = 35; // maximum amount of money
		int val3 = 53; // maximum amount of money

		System.out.println("\n(Greedy solution) Number of coins needed: " + makeChangeGreedy(denoms, val1));
		System.out.println("\n(Greedy solution) Number of coins needed: " + makeChangeGreedy(denoms, val2));
		System.out.println("\n(Greedy solution) Number of coins needed: " + makeChangeGreedy(denoms, val3));

	}

	/**
	 * Method: makeChangeGreedy
	 * 
	 * Implements the greedy algorithm for solving
	 * the change making problem.
	 * 
	 * @param denoms array containing the different denominations
	 * @param val the target sum
	 * @return the number of coins needed
	 */
	 	
	public static int makeChangeGreedy(int[] coins, int amount) {
		int[] coinReq = new int[amount + 1]; // this will store the optimal	solution for all the values -- from 0 to given amount.
		
		int[] CC = new int[coins.length]; // resets for every smaller problems and minimum in it is the optimal solution for the smaller problem.
		
		coinReq[0] = 0; // 0 coins are required to make the change for 0
		
		// now solve for all the amounts
		for (int amt = 1; amt <= amount; amt++) 
		{
			for (int j = 0; j < CC.length; j++) 
			{
				CC[j] = -1;
			}
			// Now try taking every coin one at a time and fill the solution in the CC[]
			for (int j = 0; j < coins.length; j++) 
			{
				if (coins[j] <= amt) 
				{ // check if coin value is less than amount
					CC[j] = coinReq[amt - coins[j]] + 1; // if available, select the coin and add 1 to solution of (amount-coin value)
				}
			}
			// Now solutions for amt using all the coins is stored in CC[]
			// take out the minimum (optimal) and store in coinReq[amt]
			coinReq[amt] = -1;
			for (int j = 1; j < CC.length; j++) 
			{
				if (CC[j] > 0 && (coinReq[amt] == -1 || coinReq[amt] > CC[j])) 
				{
					coinReq[amt] = CC[j];
				}
			}
		}
		// return the optimal solution for amount
		return coinReq[amount];
	}
	
	/**
	 * Main.
	 */
	public static void main(String[] args) {
		testChangeMaking();
	}
}
