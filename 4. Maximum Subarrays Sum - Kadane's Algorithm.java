/* Given an array of n elements , return the maximum subarrays sum 
Constrainsts :- 1<= N <= 10^5
                10^6 <= Arr[i] <= 10^6    
*/

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static long maxSumSubarrays(int[] A){
        long sum = A[0];
        long ans = A[0];
        for(int i = 1; i < A.length; i++) { // Loop through the array starting from the second element
            sum += A[i]; // Add the current element to the sum
            
            if(ans < sum){ // Check if the current sum is greater than the maximum sum found so far
                ans = sum; // Update the maximum sum
            }
            
            if(sum < 0) { // If the sum becomes negative, reset it to 0
                sum = 0;
            }
        }
        return ans; // Return the maximum sum
    }
    
    public static void main(String[] args) {
        int[] Arr = {1, -2, 3, 4, -1, 2}; 
        long maxSum = maxSumSubarrays(Arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}