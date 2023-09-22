//Given a 2D matrix mat of size n*m , print its element in SPIRAL ORDER 

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    // spiral printing 
	public static void printSpiral(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		
		
		int rstart = 0;
		int rend = n-1;
		int cstart = 0;
		int cend = m-1;
		
		// if we have n*m matrix, total element = n*m
		
		int tele = n * m;
		int count = 0;
				
		while(tele > 0) {
			// top wall, r = rstart, c -> cstart to cend
			for(int c = cstart; c <= cend && tele > 0; c++) {
				System.out.print(mat[rstart][c] + " ");
				tele--;
			}
			rstart++;
			
			// right wall, c = cend, r = rstart to rend 
			for(int r = rstart; r <= rend && tele > 0; r++) {
				System.out.print(mat[r][cend] + " ");
				tele--;
			}
			cend--;
			
			// bottom wall, r = rend, c = cend to cstart 
			for(int c = cend; c >= cstart && tele > 0; c--) {
				System.out.print(mat[rend][c] + " ");
				tele--;
			}
			rend--;
			
			// left wall, c = cstart, r = rend to rstart
			for(int r = rend; r >= rstart && tele > 0; r--) {
				System.out.print(mat[r][cstart] + " ");
				tele--;
			}
			cstart++;
		}
	}
 	
    public static void main(String[] args) {
        int[][] mat = {
            {10, 11, 12, 13, 14},
            {20, 21, 22, 23, 24},
            {30, 31, 32, 33, 34},
        };
        printSpiral(mat);
    }
}