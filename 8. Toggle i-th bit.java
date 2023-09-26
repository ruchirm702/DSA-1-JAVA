/* Problem Description
You are given two integers A and B. If B-th bit in A is set, make it unsetIf B-th bit in A is unset, make it set
Return the updated A value
        Problem Constraints
                    1 <= A <= 109
                    0 <= B <= 30   */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int toggleIthBit(int A, int B) {
        // Create a mask with the B-th bit set to 1 and all other bits set to 0.
        int mask = 1 << B;
        
        // Use XOR (^) to toggle the B-th bit in A.
        A = A ^ mask;
        
        // Return the updated A.
        return A;
    }
    public static void main(String[] args) {
        // Input values
        int A = 4; // Binary: 100
        int B = 1; // Toggle the 1st bit (0-indexed)

        // Call the toggleBit function and get the result
        int result = toggleIthBit(A, B);

        // Print the result
        System.out.println("Updated A: " + result);
    }
}