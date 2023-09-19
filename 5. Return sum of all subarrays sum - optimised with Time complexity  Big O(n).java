// Given an array of size N , return the sum of all subarrays sum .

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static long sumofAllSubarraysSum(int[] A){
        int n = A.length;
        long total = 0;
        for(int i=0 ; i<n ; i++){
            int start = i + 1 ;  // elem from 0 to i : [0,i] = i-0+1 (B-A+1) ==> i+1
            int end = n - i ;  // similarly elem form i to n-1 = n-1-i+1 ==> n-i
            long freq = (long) start * end ; // type casting required
            total += (freq * A[i]);   // total count = elem * occurance 
            
        }
        return total ;
    }
    public static void main(String[] args) {
        int[] A = {2, -1, 4};
        long result = sumofAllSubarraysSum(A);
        System.out.println("Total sum of all subarrays: " + result);
    }
}