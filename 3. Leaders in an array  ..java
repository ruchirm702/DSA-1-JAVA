/* Problem Description
Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
An element is a leader if it is strictly greater than all the elements to its right side.
NOTE: The rightmost element is always a leader.    
Problem Constraints 1 <= N <= 10^5
1 <= A[i] <= 10^8  */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    // Function to find leaders in an array
    public static int[] solve(int[] A) {
        // ArrayList to store leader elements
        ArrayList<Integer> leaders = new ArrayList<>();
        // Length of the array
        int n = A.length;
        // Initialize the maximum with the rightmost element
        int max = A[n - 1];

        // Add the rightmost element to leaders
        leaders.add(max);

        // Iterate through the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            int ele = A[i];
            // If the current element is greater than the maximum, it is a leader
            if (ele > max) {
                leaders.add(ele);
                max = ele;
            }
        }

        // Convert ArrayList to array
        int m = leaders.size();
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            result[i] = leaders.get(i);
        }

        // Return the array of leader elements
        return result;
    }

    public static void main(String[] args) {
        // Example array
        int[] A = {16, 17, 4, 3, 5, 2};
        // Call the solve method to find leaders
        int[] result = solve(A);

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
