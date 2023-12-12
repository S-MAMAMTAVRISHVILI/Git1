import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem57 extends ConsoleProgram {
	public void run() {
		String word1 = readLine();
		String word2 = readLine();
		if(word1.length() != word2.length()) {
			println("false");	
		} else {
			println(isAnagram(word1, word2));
		}
	}
	private boolean isAnagram(String word1, String word2) {
		int[] arrayWord1 = new int[26];
		int[] arrayWord2 = new int[26];
		char[] alphabet = new char[26];
		
		for(int j = 0; j < alphabet.length; j++) {
			alphabet[j] = (char) ('a' + j);
		}
		for(int i = 0; i < alphabet.length; i++) {
			int num1 = 0;
			int num2 = 0;
			for(int k = 0; k < word1.length(); k++) {
				if(alphabet[i] == word1.charAt(k)) {
					num1 += 1;
				}
				if(alphabet[i] == word2.charAt(k)) {
					num2 += 1;
				}
			}
			arrayWord1[i] = num1;
			arrayWord2[i] = num2;
		}
		return Arrays.equals(arrayWord1, arrayWord2);
	}
}
