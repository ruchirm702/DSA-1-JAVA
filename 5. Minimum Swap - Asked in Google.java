/* Given an array of size N and an input B . Find and return the minimum number of swaps to bring all the number less than or equal to B together
" Asked By Google "

			Problem Constraints
					1 <= length of the array <= 100000
					-109 <= A[i], B <= 109
*/

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
	
	// // Function to find the minimum number of swaps to bring all elements less than or equal to B together
	public static int minSwap(int[] arr, int b) {
		int n = arr.length;
		int countOfGood = 0;  // Initialize the count of elements less than or equal to B
		int countOfBad = 0;  // Initialize the count of elements greater than B
		for(int i = 0; i < n; i++) {  // Count elements less than or equal to B in the array
			if(arr[i] <= b) {
				countOfGood++;
			}
		}
		
		// calculate count of bad numbers in first window
		// window size = count of good numbers
		for(int i = 0; i < countOfGood; i++) {
			if(arr[i] > b) {
				countOfBad++;
			}
		}
		int ans = countOfBad;  // Initialize the answer with the count of bad numbers in the first window
		// since first window is solved, 
		// so start s = 1 and e from window size
		int s = 1;   
		int e = countOfGood;
		while(e < n) {                  // Move the window and update counts
			if(arr[e] > b) {
				countOfBad++;
			}
			if(arr[s-1] > b) {
				countOfBad--;
			} 
			ans = Math.min(ans, countOfBad);  // Update the minimum number of swaps needed
			s++;
			e++;
		}
		return ans; // Return the minimum number of swaps
	}
	
	public static void main(String args[]) {
		int[] arr = {19, 11, 3, 9, 7, 25, 6, 20, 4};
		int b = 10;
		
		System.out.println("Minimum Swapping : " + minSwap(arr, b));
	}
}
