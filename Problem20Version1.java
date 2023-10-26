import acm.program.ConsoleProgram;

public class Problem20Version1 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		int sum = 0;
		for(int i=1; i <= n; i++){
			int j = readInt("Enter number# " + i + ":" );
			sum = sum + j;
		}
		println("Sum is: " + sum);
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
