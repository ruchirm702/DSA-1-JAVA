/*
Given an Array  A[] and an int value L , Rotate array K times from Left to Right 
*/


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
import java.util.Scanner;

class Main {

    public static void reverseArray(int[] A, int left, int right) {
        // Complete Reverse
        while (left < right) {
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;

            // Changing Pointer Variables 
            left++;
            right--;
        }
    }

    public static int[] rotateArray(int[] A, int B) {
        int n = A.length;
        B = B % n; // Ensure B is within the range [0, n)

        if (B < 0) { // To manage negative B
            B = B + n;
        }

        reverseArray(A, 0, n - 1); // Reverse the entire array
        reverseArray(A, 0, B - 1); // Reverse the first B elements
        reverseArray(A, B, n - 1); // Reverse the remaining (n-B) elements

        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int A[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        int[] rotatedArray = rotateArray(A, K);

        System.out.println("Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArray[i] + " ");
        }
    }
}
