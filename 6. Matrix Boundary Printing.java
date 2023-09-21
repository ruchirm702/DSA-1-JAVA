/*
Given a matrix mat[n][n] where 'n' is its dimension, print the boundary items of given matrix 
in the clockwise direction
*/

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void printBoundary(int[][] mat) {
		int n = mat.length;
		// 1. Top wall, row is fixed = 0, col moves from 0 to n-2
		for(int c = 0; c <= n-2; c++) {
			System.out.print(mat[0][c] + " ");
		}
		// 2. Right wall, col is fixed = n-1, row moves from 0 to n-2 
		for(int r = 0; r <= n-2; r++) {
			System.out.print(mat[r][n-1] + " ");
		}
		// 3. Bottom wall, row is fixed = n-1, col moves from n-1 to 1 
		for(int c = n-1; c >= 1; c--) {
			System.out.print(mat[n-1][c] + " ");
		}
		// 4. Left wall, col is fixed = 0, row moves from n-1 to 1
		for(int r = n-1; r >= 1; r--) {
			System.out.print(mat[r][0] + " ");
		}
	}
    public static void main(String[] args) {
        int[][] mat = {
            {10,11,12,13,14},
            {20,21,22,23,24},
            {30,31,32,33,34},
            {40,41,42,43,44}
        };
        printBoundary(mat);       
    }
}