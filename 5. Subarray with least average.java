/* Problem Description
Given an array of size N, find the subarray of size K with the least average.
                Problem Constraints
                1<=k<=N<=1e5
                -1e5<=A[i]<=1e5        */
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int findSubarrayWithLeastAverage(int[] A, int B) {
        int n = A.length;
        int minAvgIdx = 0;
        int minAvgSum = 0;
        int currentSum = 0;

        // Calculate the sum of the first B elements
        for (int i = 0; i < B; i++) {
            currentSum += A[i];
        }
        minAvgSum = currentSum;

        // Start the sliding window
        for (int i = B; i < n; i++) {
            currentSum += A[i] - A[i - B]; // Add the next element and remove the first element in the window

            // Update the minimum average and its index if a smaller average is found
            if (currentSum < minAvgSum) {
                minAvgSum = currentSum;
                minAvgIdx = i - B + 1;
            }
        }

        return minAvgIdx;
    }

    public static void main(String[] args) {
        int[] A1 = {3, 7, 90, 20, 10, 50, 40};
        int B1 = 3;
        int result1 = findSubarrayWithLeastAverage(A1, B1);
        System.out.println(result1); // Output: 3
    }
}