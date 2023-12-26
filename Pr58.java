import java.util.ArrayList;
import java.util.Collections;

import acm.program.ConsoleProgram;

public class Pr58 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter matrix size: ");
		int[][] matrix  = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = n * i + j + 1;
			}
		}
		println(magicMatrix(matrix, n));
	}

	private boolean magicMatrix(int[][] matrix, int n) {
		if(matrix.length != matrix[0].length) {
			return false;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= n * n; i++) {
			list.add(i);
		}
		ArrayList<Integer> matrixList = new ArrayList<Integer>();
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrixList.add(matrix[i][j]);
			}
		}
		Collections.sort(matrixList);
		return(list.equals(matrixList));
	}
}
