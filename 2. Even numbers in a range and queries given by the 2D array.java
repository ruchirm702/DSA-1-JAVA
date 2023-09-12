/* Problem Description
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
Each query consists of two integers B[i][0] and B[i][1].
For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].

Problem Constraints
1 <= N <= 105
1 <= Q <= 105
1 <= A[i] <= 109
0 <= B[i][0] <= B[i][1] < N          */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
import java.util.*;

class Main {
    public static int[] solve(int[] A, int[][] B) {
        int N = A.length; // Get the length of the input array A
        int Q = B.length; // Get the number of queries

        int[] result = new int[Q]; // Initialize the array to store the result of queries

        int[] prefixSum = calculatePrefixSum(A); // Calculate the prefix sum array for even numbers

        // Process each Query
        for (int i = 0; i < Q; i++) {
            int left = B[i][0]; // Left index of the query
            int right = B[i][1]; // Right index of the query

            int countEvenLeft = getEvenCountBeforeIndex(prefixSum, left); // Calculate count of even numbers before left
            int countEvenRight = prefixSum[right]; // Calculate count of even numbers before or at right
            result[i] = countEvenRight - countEvenLeft; // Calculate the count of even numbers in the range [left, right]
        }
        return result; // Return the array containing the results of all queries
    }

    // Function to calculate the prefix sum array for even numbers
    public static int[] calculatePrefixSum(int[] A) {
        int N = A.length;
        int[] prefixSum = new int[N];

        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                prefixSum[i] = 1;
            }
            if (i > 0) {
                prefixSum[i] += prefixSum[i - 1];
            }
        }
        return prefixSum;
    }

    // Function to get the count of even numbers before a given index
    public static int getEvenCountBeforeIndex(int[] prefixSum, int index) {
        if (index > 0) {
            return prefixSum[index - 1];
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Example Input
        int[] A = {2, 1, 8, 3, 9, 6};
        int[][] B = {
            {0, 3},
            {3, 5},
            {1, 3},
            {2, 4}
        };

        int[] result = solve(A, B); // Calling the solve method directly
        System.out.println("Result: " + Arrays.toString(result));
    }
}
