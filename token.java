import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class token extends ConsoleProgram {
	public void run() {
		String newText = "aaa bbb ccc ddd";
		StringTokenizer tokenizer = new StringTokenizer(newText);
        String newTextToken = tokenizer.nextToken();
        print(newTextToken);
	}
}
