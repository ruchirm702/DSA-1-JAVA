/*
Given an arr[] of n elements and q queries . For each query , given indices l and r . Print Sum of all elements in range [l,r]( l and r are inclusive)
Note : l and r are array indices

Constraints :- 1 <= n , q<= 10^5
               1<= arr[i] <= 10^9
               0 <= r < n
*/


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    //Prefix Sum
    public static long [] PrefixSum(int [] arr){
        int n = arr.length;
        long psum [] = new long[n];

        psum[0] = arr[0];
        for(int i=1 ; i<n ; i++){
            psum[i] = psum[i-1]+arr[i];
        }
        return psum;
    }

    //Range Query 
    public static void RangeQuery(int arr[] , int left[] , int right[]){

        int n = arr.length;
        long [] psum = PrefixSum(arr);     //  Calculate prefix sum  , taking extra space which leads to increase in space complexity 
        for(int q=0 ; q<left.length ; q++){
            int l = left[q];
            int r = right[q];
            if(l == 0){
                System.out.println(psum[r]);
            }
            else{
                System.out.println(psum[r] - psum[l-1]); // Calculate the range sum
            }
        }
    }
    
    /*
    //Predefined inputs 
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] left = {1,0,2};
        int [] right = {3,2,4};

        //Process Range query
        RangeQuery(arr,left,right);
        
    }
    */

    // USER defined 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input array Size
        int n = sc.nextInt();

        int [] arr  = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        //Number of Queries
        int q = sc.nextInt();

        int [] left = new int[q];
        int [] right = new int[q];

        for(int i=0 ; i< q ; i++){   // Loop for reading queries 'q' times
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }

        RangeQuery(arr,left,right);
    }
        
        
}






























