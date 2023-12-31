import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Pr61 extends ConsoleProgram {
	public void run() {
		int n = readInt("n : ");
		int m = readInt("m : ");
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int x = readInt();
			numbersList.add(x);
		}
		for(int i = 0; i < numbersList.size(); i++) {
			for(int j = 0; j < numbersList.size(); j++) {
				if(numbersList.get(i) + numbersList.get(j) == m) {
					println(numbersList.get(i) + " and " + numbersList.get(j));
				}
			}
		}
	}
}
