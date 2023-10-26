import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	
	
	public void run() {
		int n = 1;
		int sum = 0;
		while(n >= 0){
			n = readInt("Enter n: ");
			sum = checkNumber(n, sum);
				
			
		
		
		}
		println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private int checkNumber(int n, int sum) {
		if(n % 2 == 0){
			sum = sum + 1;
		}
			
			
		
		return(sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
