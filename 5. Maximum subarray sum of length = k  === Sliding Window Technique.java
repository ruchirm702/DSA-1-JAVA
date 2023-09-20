/* Given arr[N] elements . return Max subarrays sum of len=k  ===> Sliding Window Technique for optimisation 

                    Problem Constraints
                    1 <= N <= 105
                    1 <= A[i] <= 106

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static long maxSumofLenk(int A[], int k) {
        int n = A.length;

        // Calculate the sum for the first window of size k
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += A[i];
        }

        // Start from the second window
        int s = 1;
        int e = k;
        long ans = sum; // Initialize the answer with the sum of the first window
        while (e < n) {
            sum = sum + A[e] - A[s - 1]; // Update the sum for the current window
            ans = Math.max(ans, sum); // Update the maximum sum if needed
            s++; // Move the window's start pointer to the right
            e++; // Move the window's end pointer to the right
        }
        return ans; // Return the maximum subarray sum of length k
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 9, -1, 7, 1, 0};
        int k = 4; // Define the length of the subarray
        long result = maxSumofLenk(A, k);
        System.out.println("Maximum subarray sum of length " + k + ": " + result);
    }
}
