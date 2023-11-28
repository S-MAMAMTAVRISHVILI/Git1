import acm.program.ConsoleProgram;

public class Pr51 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text :");
		String s = removeDuplicates(text);
		println(s);
		
		
		
		
	}

	private String removeDuplicates(String text) {
		for(int i = 0; i < text.length(); i++) {
			for(int j = 0; j < text.length(); j++) {
				if(text.charAt(i) == text.charAt(j)) {
					
				}
			}
		}
		
		return text;
	}
}
