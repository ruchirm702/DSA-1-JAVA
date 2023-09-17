// Given an array of N elements , you need to print the sum of each Subarrays , where each subarray sum is printed on newline 

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void SumofAllSubarrays(int[] A){
        int n = A.length ;
        for(int s=0 ; s<n ; s++){         // Here we have starting a index s
            int sum=0;                   // variable to store the sum of the subarray
            for(int e=s ; e<n ;e++){    // Start another loop for the ending index of subarrays.
                sum+=A[e];             // Add the current element to the sum.
                System.out.println(sum);
            }      
        }
    }
    public static void main(String[] args) {
        int A[] = {3 , 4};
        SumofAllSubarrays(A);
    }
}