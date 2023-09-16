// Given an Array , you need to print all possible subarrays where each subarray is printed on a new line .

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void printSubarrays(int [] A){
        int n = A.length;
        for(int s=0 ; s<n ; s++){                           // for starting index   
            
            for(int e=s ; e<n ; e++){                      // for ending index
                System.out.print("Start (" + s + ") " + "End (" + e + ") : Subarray --> [");
                for(int i=s ; i<=e ; i++){                // printing subarrays 
                    System.out.print(A[i]);
                    if (i < e) {
                        System.out.print(", "); // Add a comma between elements
                    }
                }
                System.out.println("]");  
                //System.out.println();                   
            }
        }
    }
    public static void main(String[] args) {
        int[] Arr = {2,8,-1,4};
        printSubarrays(Arr);
    }
}