import acm.program.ConsoleProgram;

public class Problem30 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		int ReversedNumber = reverseNumber(n);
		println(ReversedNumber);
		
		
		
		
		
		
		
		
		
		
	}

	private int reverseNumber(int n) {
		int reversedNumber = 0; 
		while( n != 0){
			int x = n % 10;
			n = n / 10;
			reversedNumber = reversedNumber * 10 + x;
			
			
			
			
			
		}
		
		return 0;
	}
}
