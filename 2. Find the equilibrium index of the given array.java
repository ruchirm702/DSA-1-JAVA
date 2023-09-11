/*
Problem Description
You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:
Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.


Problem Constraints
1 <= N <= 105
-105 <= A[i] <= 105
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

    // Function to Find equilibrium points in an array
    public static int checkfEquilibrum(int[] arr) {
        int n = arr.length;
        long[] psum = Prefixsum(arr); // Calculate prefix sum of the array
        int ans = -1;

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
                ans = i;
                break ; 
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int count = checkfEquilibrum(arr);

        // Print the number of equilibrium points in the array
        System.out.println("Number of equilibrium points: " + count);
    }
}