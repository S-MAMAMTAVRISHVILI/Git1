import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Tokenizer extends ConsoleProgram {
	public void run() {
		String text  ="sandro 2 3 4";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		while(tokenizer.hasMoreTokens()) {
			String currToken = tokenizer.nextToken();
			println(currToken);
			
			
		}
		
		
	}
}
