/* Problem Description
You have given a string A having Uppercase English letters.
You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
Problem Constraints   :-   1 <= length(A) <= 105
*/


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static long countAGPairs(String A) {
        long countG = 0;   // Counter for the number of 'G' characters encountered
        long countPair = 0;  // Counter for the number of 'AG' pairs
        
        // Traverse the string from right to left
        for (int i = A.length() - 1; i >= 0; i--) {
            if (A.charAt(i) == 'G') {
                countG++;   // Increment 'G' counter if 'G' is encountered
            } else if (A.charAt(i) == 'A') {
                countPair += countG; // Increment pair counter when 'A' is encountered
            }
        }
        
        return countPair; // Return the total number of 'AG' pairs
    }

    public static void main(String[] args) {
        String A = "BCABCGGAGBCGGAGAGBABCGGAGBCGGCGGBABCGGGGBABCGGAGBCGGAGAGBABCGGAGBCGGCGGBABCGGAGBCGGAGAGBABCGAG";
        long result = countAGPairs(A);
        System.out.println("Number of 'AG' pairs: " + result);
    }
}