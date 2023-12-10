import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class count extends ConsoleProgram {
	private int SYMBOL_NUMBER = 0;
	public void run() {
		String newLine = "Belli BelliGoal Bellighhhhh";
		StringTokenizer tokenizer = new StringTokenizer(newLine);
		String st = tokenizer.toString();
		println(st);
		SYMBOL_NUMBER += st.length(); 
	}
}
