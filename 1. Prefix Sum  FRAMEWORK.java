import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static long[] prefixSUM(int [] A){
        int n = A.length;
        long [] psum = new long[n];

        //For EDGE CASE : initializing for i=0 
        psum[0] = A[0];
        for(int i=1; i < n ; i++){
            psum[i] = psum[i-1] + A[i];
        }
        return psum ;
    }
    public static void main(String[] args) {
        int[] A =  {-3,6,2,4,5,3,8,-9,3,1};
        long[] psum = prefixSUM(A);
        for(int i = 0 ; i<A.length;i++){
            System.out.print(A[i] + " ");
        }
        
    }
}