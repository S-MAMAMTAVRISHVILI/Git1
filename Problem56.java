import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem56 extends ConsoleProgram {
	public void run() {
	int n = readInt("Total numbers : ");
	int[] array = new int[n];
	for(int i = 0; i < n; i++) {
		array[i] = readInt();
	}
	Arrays.sort(array);	
	println("Smallest to largest");
	for(int j = 0; j < n; j++) {
		println(array[j]);
	}
	}
}
