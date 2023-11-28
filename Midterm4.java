


import java.util.StringTokenizer; 
import acm.program.ConsoleProgram;



public class Midterm4 extends ConsoleProgram {
	public void run() {
		String s = readLine("Enter sentence : ");
		String sentence = "";
		StringTokenizer tokenizer = new StringTokenizer(s);
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			String reversedWord = "";
			for(int i = 0; i < word.length(); i++) {
				String x = Character.toString(word.charAt(word.length() - i - 1));
				reversedWord = reversedWord + x;
			}
			sentence = sentence + reversedWord + " ";
		}
		println(sentence);
	}
}
