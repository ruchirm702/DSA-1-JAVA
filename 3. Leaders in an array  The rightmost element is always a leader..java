/* Problem Description
Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
An element is a leader if it is strictly greater than all the elements to its right side.
NOTE: The rightmost element is always a leader.    
Problem Constraints 1 <= N <= 105
1 <= A[i] <= 108  */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int[] solve(int[] A) {
        int count = 0;                        // Counter for leaders
        int max = A[A.length - 1];            // Initialize the maximum as the rightmost element
        int[] leaders = new int[A.length];    // Create an array to store leader elements
        
        // The rightmost element is always a leader
        leaders[count++] = max;

        // Iterate through the array from right to left
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > max) {
                max = A[i];
                leaders[count++] = max;      // The current element is a leader
            }
        }

        // Create a result array with the correct size
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = leaders[count - i - 1]; // Copy leader elements to the result array
        }
        
        return result; // Return the array of leader elements
    }

    public static void main(String[] args) {
    int[] A = {16, 17, 4, 3, 5, 2};
    int[] result = solve(A); // Call the static solve method

    // Print the result array with square brackets
    System.out.print("[");
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i]);
        if (i < result.length - 1) {
            System.out.print(", ");
        }
    }
        System.out.println("]");
   }
}
