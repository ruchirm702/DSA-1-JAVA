/* Problem Description
Write a function that takes an integer and returns the number of 1 bits present in its binary representation.*/


Problem Constraints
1 <= A <= 109

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public int numSetBits(int A) {
        int count = 0;
        while(A!=0){
            if((A & 1 ) == 1 ){  // 0th bit on ON
                count++;
            }
            A = (A >> 1); // Right shift 
        }
        return count ;
    }
    public static void main(String[] args) {
        Main main = new Main(); // Create an instance of the Main class
        int A = 11; // Input value
        int result = main.numSetBits(A); // Call the method using the instance

        System.out.println("Result: " + result);
    }
}