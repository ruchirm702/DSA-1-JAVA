/*Problem Description  Given an array A of length N, return the subarray from B to C.
        Problem Constraints
                            1 <= N <= 105
                            1 <= A[i] <= 109
                            0 <= B <= C < N                                        */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[] solve(int[] A, int B, int C) {
        int n = A.length; // Get the length of the input array A
        int subarraySize = C - B + 1; // Calculate the size of the subarray
        int[] subarray = new int[subarraySize]; // Create an array to store the subarray

        for (int i = 0; i < subarraySize; i++) {
            subarray[i] = A[B + i]; // Copy elements from the input array A to the subarray
        }

        return subarray; // Return the subarray
    }

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 6};
        int B = 1;
        int C = 3;

        int[] result = solve(A, B, C); // Calling the solve method directly

        // Print the subarray
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
