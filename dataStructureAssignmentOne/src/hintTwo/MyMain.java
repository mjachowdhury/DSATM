package hintTwo;
/**
 * The main class of our project.<br>
 * .
 */
public class MyMain {

	// -------------------------------------
	// testMyQueue
	// -------------------------------------
	/**
	 * This function tests MyDynamicQueue and its static implementation.<br>
	 */
	public static void testMyQueue() {
		System.out.println("============Dynamic Implementation Using Single Linked List=================");
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		// -------------------------------------
		// 1. We create myDynamicQueue
		// -------------------------------------
		MyDynamicQueue m = new MyDynamicQueue();

		// -------------------------------------
		// 2. isEmpty
		// -------------------------------------
		System.out.println("Is it empty: " + m.isEmpty()); // --> The current
															// length is 0 as
															// myDynamicQueue is
															// created initially
															// empty

		// -------------------------------------
		// 3. Add three elements
		// -------------------------------------
		System.out.println();
		System.out.println("============Adding Elements================================");
		System.out.println("-----------------------------------------------------------");
		
		m.add(3); // --> m : [3]
		m.add(4); // --> m : [3, 4]
		m.add(5); // --> m : [3, 4, 5]
		m.add(6); // --> m : [3, 4, 5, 6]

		// -------------------------------------
		// 4. Get the first item in myDynamicQueue
		// ----------------------------------
		System.out.println();
		System.out.println("===========Display First Item in the Linked List================");
		System.out.println("----------------------------------------------------------");
		
		System.out.println("First item = " + m.first()); // --> Returns 3
		m.remove();
		System.out.println("First item = " + m.first()); // --> Returns 4

		// -------------------------------------
		// 5. Remove two elements and fail to remove another one
		// -------------------------------------
		m.remove(); // --> m : [5, 6]
		m.remove(); // --> m : [6]
		System.out.println("First item = " + m.first()); // --> Returns 6
		m.remove(); // --> m : []
		m.remove(); // --> Fails, myDynamicQueue is already empty

	}

	// -------------------------------------
	// main
	// -------------------------------------
	/**
	 * Main Method:<br>
	 * Calls to the function testMyQueue to test MyDynamicQueue and its
	 * implementation.<br>
	 * 
	 * @param args:
	 *            We will run the program parameter free, so do not worry about
	 *            it.
	 */
	public static void main(String[] args) {
		// 1. We call to the function testMyQueue
		testMyQueue();
	}

}
