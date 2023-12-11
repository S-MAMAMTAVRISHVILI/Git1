import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem55 extends ConsoleProgram {
	
	public void run() {
		int n = readInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = readInt();
		}
		int[] arrayOld = array;
		Arrays.sort(array);
		if(Arrays.equals(arrayOld, array)) {
			println("sorted");
		} else {
			println("not sorted");
		}
	}
}
