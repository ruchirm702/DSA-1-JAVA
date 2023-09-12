/* Problem Description
You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers
B[i][0] and B[i][1].
For every query, the task is to calculate the sum of all even indices in the range A[B[i][0]…B[i][1]].
Note : Use 0-based indexing

Problem Constraints
1 <= N <= 105
1 <= Q <= 105
1 <= A[i] <= 100
0 <= B[i][0] <= B[i][1] < N          */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int[] solve(int[] A, int[][] B) {
        // Initializing an array to store results for each query
        int[] result = new int[B.length];

        // Process each query
        for (int i = 0; i < B.length; i++) {
            int start = B[i][0]; // Starting index of the query range
            int end = B[i][1];   // Ending index of the query range
            int sum = calculateEvenIndexSum(A, start, end); // Calculating the sum of even indices in the range
            result[i] = sum; // Storing the result for the current query
        }

        return result; // Returning the array containing results for all queries
    }

    // Function to calculate the sum of all even indices in the given range
    public static int calculateEvenIndexSum(int[] A, int start, int end) {
        int sum = 0;
        
        for (int j = start; j <= end; j++) {    // Iterating over the elements in the given range
            if (j % 2 == 0) { // Check if the index is even
                sum += A[j]; // Adding the value at even index to the sum
            }
        }
        return sum; // Returning the sum of even indices in the range
    }

    public static void main(String[] args) {
        
        int[] A = {2, 1, 8, 3, 9};
        int[][] B = {
            {0, 3},
            {2, 4}
        };

        // Calling the solve function to get the results for the queries
        int[] result = solve(A, B);

        // Printing the results
        System.out.println("Results: " + Arrays.toString(result));
    }
}