import acm.program.ConsoleProgram;

public class Pr47 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text : ");
		boolean isPalindrom = checkPalindrom(text);
		println("The text is palindrom : " + isPalindrom);
		
		
		
	}

	private boolean checkPalindrom(String text) {
		for(int i = 0; i < text.length() / 2; i++) {
			if(text.charAt(i) != text.charAt(text.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
