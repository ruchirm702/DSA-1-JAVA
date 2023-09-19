// Given a string A = "amazon", find the number of subarrays starting with the character 'a'.

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static int countSubarraysStartingWithA(String A) {
        int count = 0;
        int n = A.length();
        
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == 'a' || A.charAt(i) == 'A') {
                // If the current character is 'a' or 'A', count all subarrays starting from this position.
                count += (n - i);
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        String A = "amazon";
        int result = countSubarraysStartingWithA(A);
        System.out.println("Number of subarrays starting with 'a': " + result);
    }
}