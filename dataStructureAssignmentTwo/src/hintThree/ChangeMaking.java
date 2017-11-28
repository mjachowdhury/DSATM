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
	public static void testChangeMaking()
	{
	
			int[] denoms = new int[4];

			// possible changes of coins 
			denoms[0]=20; // coin of value 20
			denoms[1]=10; // coin of value 10
			denoms[2]=5;  // coin of value 5
			denoms[3]=1;  // coin of value 1
	
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
	/*public static int makeChangeGreedy(int[] denoms, int val)
	{
		 int result = 0;

	        while (val != 0) {

	            for (int i=denoms.length-1; i>=0 ; i--) {
	                if (denoms[i] <= val) {
	                    val = val - denoms[i];
	                  System.out.println("Adding " +denoms[i]);
	                  i++; //neutralizing i-- with i++.

	                    result++;
	                }
	            }
	        }
	        return result;
	}*/
	
	/*public static int makeChangeGreedy(int[] v, int amount) {
		int[][] solution = new int[v.length + 1][amount + 1];

		// if amount=0 then just return empty set to make the change
		for (int i = 0; i <= v.length; i++) {
			solution[i][0] = 1;
		}

		// if no coins given, 0 ways to change the amount
		for (int i = 1; i <= amount; i++) {
			solution[0][i] = 0;
		}

		// now fill rest of the matrix.

		for (int i = 1; i <= v.length; i++) {
			for (int j = 1; j <= amount; j++) {
				// check if the coin value is less than the amount needed
				if (v[i - 1] <= j) {
					// reduce the amount by coin value and
					// use the subproblem solution (amount-v[i]) and
					// add the solution from the top to it
					solution[i][j] = solution[i - 1][j]
							+ solution[i][j - v[i - 1]];
				} else {
					// just copy the value from the top
					solution[i][j] = solution[i - 1][j];
				}
			}
		}
		return solution[v.length][amount];
	}
*/
	
	
	
	public static int makeChangeGreedy(int[] coins, int amount) {
		int[] coinReq = new int[amount+1]; // this will store the optimal solution
											// for all the values -- from 0 to
											// given amount.
		int[] CC = new int[coins.length]; // resets for every smaller problems
											// and minimum in it is the optimal
											// solution for the smaller problem.
		coinReq[0] = 0; // 0 coins are required to make the change for 0
		// now solve for all the amounts
		for (int amt = 1; amt <= amount; amt++) {
			for (int j = 0; j < CC.length; j++) {
				CC[j] = -1;
			}
			// Now try taking every coin one at a time and fill the solution in
			// the CC[]
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= amt) { // check if coin value is less than
										// amount
					CC[j] = coinReq[amt - coins[j]] + 1; // if available,
																// select the
																// coin and add
																// 1 to solution
																// of
																// (amount-coin
					// value)
				}
			}
			//Now solutions for amt using all the coins is stored in CC[]
//			take out the minimum (optimal) and store in coinReq[amt]
			coinReq[amt]=-1;
			for(int j=1;j<CC.length;j++){
				if(CC[j]>0 && (coinReq[amt]==-1 || coinReq[amt]>CC[j])){
					coinReq[amt]=CC[j];
				}
			}
		}
		//return the optimal solution for amount
		return coinReq[amount];
		
	}
	
	
	  

	/*
	 // A Naive recursive JAVA program to find minimum of coins
// to make a given change V
class coin
{
    // m is size of coins array (number of different coins)
    static int minCoins(int coins[], int m, int V)
    {
       // base case
       if (V == 0) return 0;
      
       // Initialize result
       int res = Integer.MAX_VALUE;
      
       // Try every coin that has smaller value than V
       for (int i=0; i<m; i++)
       {
         if (coins[i] <= V)
         {
             int sub_res = minCoins(coins, m, V-coins[i]);
      
             // Check for INT_MAX to avoid overflow and see if
             // result can minimized
             if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                res = sub_res + 1;
         }
       }
       return res;
    }
    public static void main(String args[])
    {
       int coins[] =  {9, 6, 5, 1};
       int m = coins.length;
       int V = 11;
       System.out.println("Minimum coins required is "+ minCoins(coins, m, V) );
    }
}/* This code is contributed by Rajat Mishra */
	// */
	
	/*public static int coinChangeGreedy(int[] coins, int n) {

        int result = 0;

        while (n != 0) {

            for (int i=coins.length - 1 ; i>=0 ; i--) {
                if (coins[i] <= n) {
                    n = n - coins[i];
                  System.out.println("Adding " +coins[i]);
                  i++; //neutralizing i-- with i++.

                    result++;
                }
            }
        }
        return result;
    }*/
	/**
	 * Main.
	 */
	public static void main(String[] args)
	{
		testChangeMaking();
	}
}
