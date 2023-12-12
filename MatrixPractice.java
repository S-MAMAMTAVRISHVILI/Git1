import acm.program.ConsoleProgram;

public class MatrixPractice extends ConsoleProgram {
	public void run() {
		matrixSample();
//		arraySample();
//		arrayListSample();
	}

	private void matrixSample() {
		int[][] myMatrix = new int[10][5];
		println(myMatrix);
		for (int i = 0; i < myMatrix.length; i++) {
			println(myMatrix[i]);
			for(int j = 0; j < myMatrix[i].length; i++) {
				println(myMatrix[i][j]);
			}
		}
	}
}
