/*
Given an array ar[N] , you have to find a number of leaders in the arry . 
Leader : An elemet ar[i] is said to be a leader if it is greater than the maximum of all elements present on the left of it i.e. [0,i-1]

Note : ar[0] is already considered a leader

Constraints : 1 <= N <= 10^5
              1 <= ar[i] <= 10^9

              Arr : [ 3 , 2 , 4 , 5 , 2 , 7 , -1 , 15]
*/

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int leaderCount(int [] A ){   // Function to count the number of leaders in an integer array
        int count = 0 ;                        // Counter for leaders
        int max = A[0];                       // Initialize the maximum as the last element of the array
        for(int i=1 ; i < A.length ; i++){     // Iterate through the array from right to left
            if(A[i] > max){
                max = A[i];  
                count++ ;                  // The current element is a leader
            }
        }
        return count ; 
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 2, 7, -1, 15};
        int result = leaderCount(arr);
        System.out.println("Number of leaders in the array: " + result);
    }
}