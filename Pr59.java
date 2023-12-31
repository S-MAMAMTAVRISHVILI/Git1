import acm.program.ConsoleProgram;

public class Pr59 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		int[][] matrix  = new int[n][n];
		int[][] subRect = subRect(n ,matrix);
		println(subRect.toString());

		
	}

	private int[][] subRect(int n, int[][] matrix) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					for(int x = 0; x < n; x++) {
						if(matrix[i][j] == 0) {
							continue;
						} 
					}
				}
			}
		}
		return null;
	}
}
