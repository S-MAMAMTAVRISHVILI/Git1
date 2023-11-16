import acm.program.ConsoleProgram;

public class Problem45 extends ConsoleProgram {

	
	
	public void run() {
		String a = readLine("Enter text:");
		String b = readLine("Enter character:");
		int number = 0;
		for(int i = 0 ;i < a.length(); i++) {
			if(a.charAt(i) == b.charAt(i)) {
				number += number;
			}
		}
		
		
		
		
	}
}
