/*
Given an integer A , you need to find the count of its factors . 
Constraints  : 1<= A <= 10^9

*/



import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int CountofFACTORS(int A){
        int count = 0 ;
        for(int i = 1 ; i*i<=A;i++){
            if(A%i ==0){
                if( i == A/i){
                    count++;
                }
                else{
                    count+=2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //int A = 12 ;

        //Taking user input 
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        
        int result = CountofFACTORS(A);
        System.out.println("Number of Factors of " + A + " is " + result );
    }
}

/*
Time Complexity:

The loop runs from i = 1 to i * i <= A. In the worst case, it will run until i reaches the square root of A, which is roughly sqrt(A).

Inside the loop, there are basic arithmetic operations and conditional checks (A % i, i == A / i, etc.), all of which are constant-time operations.

Therefore, the overall time complexity of the CountofFACTORS method is O(sqrt(A)).
*/





