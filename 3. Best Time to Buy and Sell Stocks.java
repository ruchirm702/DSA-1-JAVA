/*
Say you have an array A , for which ith element is the price of a given stock on day i . If you were only permitted to complete at most one transaction
(i.e. buy one and sell one share of the stock) , design an algorithm to find the maximum profit . 

Return the maximum possile profit.

Problem Constraints :-  0 <= A.size() <= 10^5
                        1 <= A[i] <= 10^9


                        Stock : [3 , 5 , 7 , 2 , 4 , 3 , 8 , 6 ]
*/

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    // Function to find the maximum profit by buying and selling one share of the stock
    public static int maxProfit(int[] Stock) {
        int n = Stock.length;
        int max = Stock[n - 1];  // Initialize the maximum price as the last element
        int ans = 0;             // Initialize the maximum profit as 0
        
        // Iterate through the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (max < Stock[i]) {
                max = Stock[i];  // Update the maximum price if a greater price is found
            }
            if (ans < max - Stock[i]) {
                ans = max - Stock[i];  // Calculate and update the maximum profit
            }
        }
        return ans;  // Return the maximum profit
    }

    public static void main(String[] args) {
        int[] Stock = {3, 5, 7, 2, 4, 3, 8, 6};
        int result = maxProfit(Stock);
        System.out.println("Maximum profit: " + result);
    }
}