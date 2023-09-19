/*Problem Description
Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.
        Problem Constraints
                                1 <= len(A) <= 10^3
                                1 <= A[i] <= 10^3
                                1 <= B <= 10^7                */


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int GoodSubarray(int[] A, int B) {
        int n = A.length;
        int goodSubarrays = 0;

        for (int s = 0; s < n; s++) {
            int sum = 0;

            for (int e = s; e < n; e++) {
                sum += A[e];

                if ((e - s + 1) % 2 == 0 && sum < B) {
                    goodSubarrays++;
                }
                if ((e - s + 1) % 2 != 0 && sum > B) {
                    goodSubarrays++;
                }
            }
        }

        return goodSubarrays;
    }

    public static void main(String[] args) {
        int[] A = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int B = 65;

        int result = GoodSubarray(A, B);

        System.out.println("There are " + result + " good subarrays");
    }
}