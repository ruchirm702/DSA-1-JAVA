/* Problem Description
        You are given an array A of N integers.
        Return a 2D array consisting of all the subarrays of the array
        Note : The order of the subarrays in the resulting 2D array does not matter.
        Problem Constraints
                        1 <= N <= 100
                        1 <= A[i] <= 105                                               */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int[][] generateSubarrays(int[] A) {
        int n = A.length;
        int totalSubarrays = n * (n + 1) / 2;
        int subarrayIndex = 0;
        int[][] subarrays = new int[totalSubarrays][];

        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                int subarraySize = e - s + 1;
                subarrays[subarrayIndex] = new int[subarraySize];

                for (int k = s, l = 0; k <= e; k++, l++) {
                    subarrays[subarrayIndex][l] = A[k];
                }

                subarrayIndex++;
            }
        }

        return subarrays;
    }

    public static void main(String[] args) {
        int[] A = {5, 2, 1, 4};
        int[][] subarrays = generateSubarrays(A);

        // Print the generated subarrays with the desired format
        System.out.print("[");
        for (int i = 0; i < subarrays.length; i++) {
            System.out.print("[");
            for (int j = 0; j < subarrays[i].length; j++) {
                System.out.print(subarrays[i][j]);
                if (j < subarrays[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("]");
            if (i < subarrays.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.print("]");
    }
}



