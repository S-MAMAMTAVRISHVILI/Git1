import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Pr50 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		StringTokenizer tokenizer = new StringTokenizer(text);
		int number = tokenizer.countTokens();
		println("The text contain " + number + "words");
	}
}
