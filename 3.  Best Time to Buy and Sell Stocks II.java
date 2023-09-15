/* Problem Description
Say you have an array, A, for which the ith element is the price of a given stock on day i.
Design an algorithm to find the maximum profit.
You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

Problem Constraints
0 <= len(A) <= 1e5
1 <= A[i] <= 1e7    */


import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {

    // This function calculates the maximum profit from buying and selling stocks
    public static int maxProfit(final int[] A) {
        int profit = 0; // Initialize the profit to zero

        // Iterate through the stock prices starting from the second day
        for (int i = 1; i < A.length; i++) {
            // Check if the stock price on the current day is greater than the previous day
            if (A[i] > A[i - 1]) {
                // If it is, calculate the profit by selling on the current day and buying on the previous day
                profit += A[i] - A[i - 1];
            }
        }

        // Return the total profit
        return profit;
    }

    // This function prints the maximum profit
    public static void printMaxProfit(int[] A) {
        int profit = maxProfit(A); // Calculate the maximum profit
        System.out.println("Maximum Profit: " + profit);
    }

    public static void main(String[] args) {
        // Input 1:
        int[] A1 = {1, 2, 3};
        printMaxProfit(A1);        
    }
}
   