/* Given arr[n] where every element repeat twice except for one element , which occurs once , 
find that unique element
    Constraints :
                    1 <= N <= 10 ^ 5 
                    1 <= arr[i] <= 10^9                           */

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int uniqueElement(int[] A){
        int n = A.length;
        int ans = 0 ;
        for(int i=0 ; i<n ; i++){
            ans = (ans ^ A[i]);
        }
        return ans ;
    }
    public static void main(String[] args) {
        // Example input
        int[] arr = {1, 7, 3, 7, 1};

        // Find and print the unique element
        int uniqueElement = uniqueElement(arr);
        System.out.println("The unique element is: " + uniqueElement);
    }
}