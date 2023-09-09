/*
Given an array A[] , Reverse the array .
Constraints : 1) Number of Iteration allowed is N  ( single iteration only )
              2) Using Extra Array is not Allowed . 
*/


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static void ReversedArray(int [] A){
        int left = 0;
        int right = A.length-1;

        while(left< right){
            //Swapping
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;

            // Changing in Pointer Variables 
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        
        int A[] = new int[n];

        for(int i=0 ; i< n ; i++){
            A[i] = sc.nextInt();
        }
        
        ReversedArray(A);

        System.out.println("Reversed Array : ");
        for(int i= 0 ; i<n ; i++){
            System.out.print(A[i] + " ");
        }
        
        
        
    }
}