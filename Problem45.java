import acm.program.ConsoleProgram;

public class Problem45 extends ConsoleProgram {

	
	
	public void run() {
		String a = readLine();
		String b = readLine();
		int number = 0;
		for(int i = 0 ; i < a.length(); i++) {
			if(a.charAt(i) == b.charAt(i)) {
				number += number;
			}
		}
		println(number);
		
		
		
	}
}
