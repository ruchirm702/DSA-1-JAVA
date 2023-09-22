// Given mat[N][M] , find the sum of all Submatrices Sum

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    // sum of all submatrix sum 
	// Contribution Technique 
	public static int sumOfSubmatrix(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				
				int countOfTL = (i+1) * (j+1);
				int countOfBR = (m-j) * (n-i);
				int freq = countOfTL * countOfBR;
				
				sum += (mat[i][j] * freq);
			}
		}
		return sum;
	}
    public static void main(String[] args) {
        int[][] mat = {
			{3, 1},
			{-1, -2},
			{2, 4}
		};
		
		System.out.println(sumOfSubmatrix(mat));
    }
}