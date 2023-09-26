/* Problem Description
You are given two integers A and B.Set the A-th bit and B-th bit in 0, and return output in decimal Number System.
Note: The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.
    Problem Constraints
                        0 <= A <= 30
                        0 <= B <= 30   */


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int setBits(int A, int B) {
        int n = 0;
        // Set Ath bit in n
        n = (n | (1 << A)); // Left shift
        // Set Bth bit in n
        n = (n | (1 << B));
        return n;
    }

    public static void main(String[] args) {
        int A = 3;
        int B = 5;
        int result = setBits(A, B);
        System.out.println("Result: " + result);
    }
}
