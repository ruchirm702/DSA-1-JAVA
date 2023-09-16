// Given an Array , you need to print all possible subarrays where each subarray is printed on a new line .

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void printSubarrays(int [] A){
        int n = A.length;
        for(int s=0 ; s<n ; s++){                           // for starting index
            for(int e=0 ; e<n ; e++){                      // for ending index
                for(int i=s ; i<=e ; i++){                // printing subarrays 
                    System.out.print(A[i] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] Arr = {2,8,-1,4};
        printSubarrays(Arr);
    }
}