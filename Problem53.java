import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Problem53 extends ConsoleProgram {
	private int SYMBOL_NUMBER = 0;
	private int WORD_NUMBER = 0;
	private int SENTENCE_NUMBER = 0;
	private int SENTENCE_ENDING1 = 0;
	private int SENTENCE_ENDING2 = 0;
	private int SENTENCE_ENDING3 = 0;
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("ragacTeqsti"));
			while(true) {
				String newLine = reader.readLine();
				if(newLine == null) {
					break;
				}
				countSymbolNumber(newLine);
				countWordNumber(newLine);
				countSentenceNumber();
				countEndings();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void countSymbolNumber(String newLine) {
		StringTokenizer tokenizer = new StringTokenizer(newLine);
		while (tokenizer.hasMoreTokens()) {
			String st = tokenizer.nextToken();
			SYMBOL_NUMBER += st.length(); 
		}
	}
	private void countWordNumber(String newLine) {
		StringTokenizer tokenizer = new StringTokenizer(newLine);
		WORD_NUMBER += tokenizer.countTokens(); 
	}
	private void countSentenceNumber() {
		SENTENCE_NUMBER += 1;
	}
	private void countEndings(String newLine) {
		if(newLine.charAt(newLine.length() - 1) == '.') {
			SENTENCE_ENDING1 += 1;
		} else if(newLine.charAt(newLine.length() - 1) == '!') {
			SENTENCE_ENDING2 += 1;
		} else if(newLine.charAt(newLine.length() - 1) == '?') {
			SENTENCE_ENDING3 += 1;
		}
	}
}
