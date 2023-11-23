import acm.program.ConsoleProgram;

public class P49 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text :");
		int number = 0;
		for(int i = 0; i < text.length(); i++) {
			int digit = text.charAt(i) - '0';
			number = number * 10 + digit;
		}
		println(number);
		
		
	}
	
}
