import acm.program.ConsoleProgram;

public class Pr48 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text : ");
		int number = 0;
		for(int i = 0; i < text.length(); i++) {
			for(int j = 0; j < text.length(); j++) {
				if(text.charAt(i) == text.charAt(j)) {
					number = number + 1;
				}
			}
			print(text.charAt(i));
			println(" " + number + " times");
			
		}
		
		
		
		
	}
}
