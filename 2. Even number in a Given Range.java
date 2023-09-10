/*
Given an array arr[] of n elements and q queries . For each query given indices l and r calculate and print the no. of even no in the given range
(l and r both inclusive)
Constraints :- 1 <= n <= 10^5
               1 <= arr[i] <= 10^9
               0 <= l <= r < n
*/
import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    public static int[] preCount(int [] arr){
        int n = arr.length ;
        int [] pcount = new int[n];
        if(arr[0] % 2 == 0){
            pcount[0] = 1 ;
        }
        else {
            pcount[0] = 0 ; 
        }
        for(int i = 1 ; i<n ; i++){
            if(arr[i] % 2 == 0){
                pcount[i] =pcount[i-1] + 1 ;
            }
            else{
                pcount[i] = pcount[i-1];
            }
        }
        return pcount;
    }
    
    public static int[] solve(int [] arr, int [] left, int [] right){
        int [] pcount = preCount(arr);   // calling preCount fun
        int[] results = new int[left.length];
        for(int q=0 ; q<left.length ; q++){
            int l = left[q];
            int r = right[q];
            if(l==0){
                results[q] = pcount[r];
            }
            else{
                results[q] = pcount[r] - pcount[l - 1];
            }
        }
        return results;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,10,2,55,73,77,2,6,77,5,3,24};
        int[] left = { 1 , 2 , 4 };
        int[] right = { 5 , 8 ,12};
        int[] result = solve(arr,left,right);
        for (int i = 0; i < result.length; i++) {
            System.out.println("Query " + (i + 1) + ": " + result[i]);
        }
    }
}