import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram {
	public void run() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			int digit = readInt();
			if(digit == -1) {
				break;
			}
			list.add(digit);
		}
		println("Reversed : ");
		for(int i = list.size() - 1; i >= 0; i--) {
			println(list.get(i));
		}
	}
}
