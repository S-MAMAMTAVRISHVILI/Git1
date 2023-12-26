import acm.program.ConsoleProgram;

public class Pr49 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text : ");
		int number = stringToInteger(text);
		println(number);
		
		
	}

	private int stringToInteger(String text) {
		int number = 0;
		for(int i = 0; i < text.length(); i++) {
			int digit = text.charAt(i) - '0';
			number = number * 10 + digit;
		}
		return number;
	}
	
}

