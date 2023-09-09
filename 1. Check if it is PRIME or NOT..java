import java.util.*;
/*
Given a number N , check if it is PRIME or NOT. 
*/


import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static boolean isPRIME(int A){
        if (A <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        
        int count = 0 ;
        for(int i=1 ; i*i<=A ; i++){
            if(A/i == 0 ){
                if(A/i == i){
                    count++;
                }
                else{
                    count+=2;
                }
            }
        }
        if(count == 2 ){
            return true;
        }
        else {
            return false ;
        }
    }
           
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        boolean result = isPRIME(A);
        System.out.println( result);
    }
}