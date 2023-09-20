/* Problem Description
Given an array A of length N. Also given are integers B and C.
Return 1 if there exists a subarray with length B having sum C and 0 otherwise
            Problem Constraints
                    1 <= N <= 10^+5
                    1 <= A[i] <= 10^4
                    1 <= B <= N 
                    1 <= C <= 1^9   */


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int subarrayExists(int[] A, int B, int C) {
        int n = A.length;
        int currentSum = 0;

        // Calculate the sum of the first B elements in the array.
        for (int i = 0; i < B; i++) {
            currentSum += A[i];
        }

        // Check if the sum of the first B elements is equal to C.
        if (currentSum == C) {
            return 1; // Found a subarray with the given sum.
        }

        // Slide the window through the array and update the sum.
        for (int i = B; i < n; i++) {
            currentSum += A[i] - A[i - B]; // Add the next element and subtract the first element in the window.
            if (currentSum == C) {
                return 1; // Found a subarray with the given sum.
            }
        }

        return 0; // No subarray with the given sum found.
    }

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 6, 1};
        int B = 3;
        int C = 11;
        int result = subarrayExists(A, B, C);
        System.out.println(result); // Output: 1
    }
}