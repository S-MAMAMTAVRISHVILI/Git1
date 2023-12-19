import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram {
	public void run() {
		String numStr = "1234" ;
		int num = stringToInt(numStr);		
		println(num);
		
		
		
		
	}

	private int stringToInt(String numStr) {
		int num = 0;
		for(int i = 0; i < numStr.length() ; i++) {
			char currCh = numStr.charAt(i);
			int currDigit = currCh - '0';
			num = num * 10 + currDigit;
		}
		return num;
	}
}
