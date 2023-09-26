/*  Problem Description
You are given two integers A and B.
If B-th bit in A is set, make it unset.If B-th bit in A is unset, leave as it is.Return the updated A value.
    Note: The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
        Problem Constraints
                    1 <= A <= 109
                    0 <= B <= 30    */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int unsetBit(int A, int B) {
        // Check if the B-th bit is set in A.
        if ((A & (1 << B)) != 0) {
            // If set, subtract 2^B from A to unset the B-th bit.
            A -= (1 << B);
        }

        // Return the updated A.
        return A;
    }

    public static void main(String[] args) {
        int A = 5;
        int B = 2;

        int result = unsetBit(A, B);

        System.out.println("Updated A: " + result);
    }
}