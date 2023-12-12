import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    
    public static int countofEquilibrum(int [] arr){
        int n = arr.length;
        int count = 0 ; 
        for(int i=0; i < n;  i++){
            int lsum = 0 , rsum = 0 ;
            for(int j=0; j<i; j++){
                lsum += arr[j];
            }
            for(int k=i+1; k <  n ; k++ ){
                rsum += arr[k];
            }
            if(lsum == rsum){
                count++;
            }
        }
        return count;
            
    }
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 2, 2};
        System.out.println("The number of Equilibrum index is " + countofEquilibrum(arr));
    }
}