/* Problem Description : Given an integer A. Unset B bits from the right of A in binary.
For example, if A = 93 and B = 4, the binary representation of A is 1011101.
If we unset the rightmost 4 bits, we get the binary number 1010000, which is equal to the decimal value 80.
    Problem Constraints
                1 <= A <= 1018
                1 <= B <= 60   */


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
public class Main {
    public static long unsetRightBits(long A, int B) {
        // Make a copy of A
        long result = A;

        // Iterate through the rightmost B bits
        for (int i = 0; i < B; i++) {
            // Check if the current bit is set (1)
            if ((A & (1L << i)) > 0) {
                // If set, unset the bit in the result by subtracting 2^i
                result -= (1L << i);
            }
        }

        // Return the result with B rightmost bits unset
        return result;
    }

    public static void main(String[] args) {
        // Input values
        long A = 37;
        int B = 3;

        // Call the unsetRightBits function and get the result
        long result = unsetRightBits(A, B);

        // Print the result
        System.out.println("Updated A: " + result);
    }
}