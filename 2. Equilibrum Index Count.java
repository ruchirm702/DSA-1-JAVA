/*
Given an array arr[] of n elements , count the number of equilibrium indices . An index i is said to be equilibrium index if sum of all indices on left of 
ith index is equal to the sum of all indices on right of ith index .

NOTE : If i == 0 , left sum = 0
        if i = n-1 , right sum = 0 ;

Constraints :- 1<=n<=10^5
                1<=arr[i]<=10^9
*/

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    // Function to calculate the prefix sum of an array
    public static long[] Prefixsum(int[] arr) {
        int n = arr.length;
        long[] psum = new long[n];  // Create an array to store prefix sums

        // Manual initialization for i=0 (Edge case)
        psum[0] = arr[0];

        // Calculate the prefix sum for the remaining elements
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + arr[i];
        }
        return psum;
    }

    // Function to count equilibrium points in an array
    public static int countofEquilibrum(int[] arr) {
        int n = arr.length;
        long[] psum = Prefixsum(arr); // Calculate prefix sum of the array
        int count = 0;

        // Iterate through each index of the array
        for (int i = 0; i < n; i++) {
            long lsum = 0;

            // Calculate the sum of elements to the left of the current index
            if (i != 0) {
                lsum = psum[i - 1];
            }

            // Calculate the sum of elements to the right of the current index
            long rsum = psum[n - 1] - psum[i];

            // Check if the sum of elements to the left and right is equal
            if (lsum == rsum) {
                count++; // Found an equilibrium point
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {1, 3, 5, 2, 2};
        int count = countofEquilibrum(arr);

        // Print the number of equilibrium points in the array
        System.out.println("Number of equilibrium points: " + count);
    }
}