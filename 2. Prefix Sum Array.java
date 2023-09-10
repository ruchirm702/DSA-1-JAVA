// Prefix Sum

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static long[] Prefixsum(int [] arr){
        int n = arr.length;
        long [] psum = new long[n] ;  // psum will have same length as of arr

        // Manual initialization for i=0 (Edge case)
        psum[0] = arr[0];
        for(int i=1 ; i<n ; i++){
            psum[i] = psum[i-1] + arr[i];
        }
        return psum; 
    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 2 ,3 ,4 ,5 };
        long psum[] = Prefixsum(arr);

        for(int i=0 ; i<psum.length ; i++){
            System.out.print(psum[i]);
            if(i < psum.length - 1 ){      //  to print a space (" ") after each element except for the last element
                System.out.print(" ");
            }
            
        }
    }
}