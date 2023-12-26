import acm.program.ConsoleProgram;

public class Pr46 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text : ");
		char character = returnCharacter(text);
		println("Most common character is " + character);
		
		
	}

	private char returnCharacter(String text) {
		int number = 0;
		int max = 0;
		char commonChar = 'a';
		for(int i = 0; i < text.length(); i++) {
			for(int j = 0; j < text.length(); j++) {
				if(text.charAt(i) == text.charAt(j))
					number = number + 1;
			}
			if(number > max) {
			max = number;
			commonChar = text.charAt(i);
			}
		}
		return commonChar;
	}
}
