import acm.program.ConsoleProgram;

public class Pr45 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text : ");
		String Character = readLine("Enter character : ");
		int number = 0;
		for(int i = 0; i < text.length(); i++) {
			if(Character.charAt(0) == text.charAt(i)) {
				number = number + 1;
			}
		}
		println("Character is in the text for " + number + " times");
	}
}
