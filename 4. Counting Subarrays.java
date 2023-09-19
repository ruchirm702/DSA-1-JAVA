/*Problem Description
Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.
                        Problem Constraints
                                1 <= N <= 103
                                1 <= A[i] <= 1000
                                1 <= B <= 107   */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public int solve(int[] A, int B) {
        int count = 0;  // Initialize a count to keep track of valid subarrays
        int sum = 0;    // Initialize the current sum
        int left = 0;   // Initialize the left pointer of the sliding window

        for (int right = 0; right < A.length; right++) {
            sum += A[right];  // Add the current element to the sum

            // Check if the sum exceeds or equals B
            while (sum >= B) {
                sum -= A[left];  // Remove elements from the left until the sum is less than B
                left++;          // Move the left pointer to the right
            }

            // Update the count by adding the number of valid subarrays ending at the current right pointer
            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, 11, 2, 3, 15};
        int B = 10;

        Main main = new Main();
        int result = main.solve(A, B);

        System.out.println("The subarrays with sum less than B are: " + result);
    }
}
