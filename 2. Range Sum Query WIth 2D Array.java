/*
Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Problem Constraints
1 <= N, M <= 105
1 <= A[i] <= 109
0 <= L <= R < N
*/


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static long [] prefixSum(int[] A){
        int n = A.length;
        long [] psum = new long[n];

        //Manual Intialization for i=0
        psum[0] = A[0];
        for(int i=1 ; i<n ; i++){
            psum[i] = psum[i-1] + A[i];
        }
        return psum;      
    }

    public static long[] rangeSumQuery(int [] A, int[][] B ){
        int m = B.length;
        long [] psum = prefixSum(A); 
        long [] ans = new long[m];
        
        // Queries
        for(int q=0 ; q<m; q++){
            int l = B[q][0];
            int r = B[q][1];
            if(l == 0){
                ans[q] = psum[r];
            }
            else{
                ans[q] = psum[r] - psum[l-1];
            }
        }
        return ans;
        
    }

    
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int [][] B = {{0,3},{1,2}};

        long [] result = rangeSumQuery(A,B);

        System.out.print(" Results :- [");
        for(int i=0 ; i<result.length ; i++){
            System.out.print( result[i]);
            if(i<result.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}