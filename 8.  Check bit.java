/* Problem Description
You are given two integers A and B. Return 1 if B-th bit in A is set.Return 0 if B-th bit in A is unset
Note: The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
    Problem Constraints
                    1 <= A <= 109
                    0 <= B <= 30    */


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
public class Main {
    public static int checkBit(int A, int B) {
        int bit = ((A >> B) & 1);
        if (bit == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int A = 8;
        int B = 2;

        int result = checkBit(A, B);

        System.out.println("Result: " + result);
    }
}
