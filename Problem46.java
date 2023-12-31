import acm.program.ConsoleProgram;


public class Problem46 extends ConsoleProgram {
	public void run() {
		String a = readLine("Enter text:");
		int number = 0;
		int max = 0;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {
					number = number + 1;
				}
			}
		max = number;
//		if( > number) {
//			
//		}
//		
		number = 0;
		
		
		}
		

	}
}
