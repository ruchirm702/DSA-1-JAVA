/*
Given a character array ch[N] of size N , we have to calculate number of pairs of indices (i,j) where i<j && ch[i] == 'a' && ch[j] == 'g' .
Constrains :- 
                1 <= N <= 10^5
                'a' <= ch[i] <= 'z'

                Arr = [ b , a , a , g , d , c , a , g ]

My Observation :- 1) Maximum possible length of array --> 10^5
                  2) Charcter array have lower case alphabet 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    // Function to count the number of 'ag' pairs in the character array
    public static int countPair(char[] ch) {
        int countg = 0;   // Counter for 'g' characters
        int countp = 0;   // Counter for 'ag' pairs
        
        // Iterate through the character array from the last index to the first
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == 'g') {
                countg++;   // Increment 'g' counter if 'g' is encountered
            } else if (ch[i] == 'a') {
                countp += countg;   // Increment pair counter when 'a' is encountered
            }
        }
        
        return countp; // Return the count of 'ag' pairs
    }

    public static void main(String[] args) {
        char[] arr = { 'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g' };
        int result = countPair(arr);
        System.out.println("Number of 'ag' pairs: " + result);
    }
}