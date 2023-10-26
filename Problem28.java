import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	
	
	public void run() {
		int n = 1;
		int sum = 0;
		while(n != SENTINEL){
			n = readInt("Enter n: ");
			if(n==SENTINEL){
				break;
			}
			if(n > -1){
			sum = checkNumber(n, sum);
			}else {
			println("Number should be nonnegative!");	
			}	
			
		
		
		}
		println("Number of even numbers is: " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private int checkNumber(int n, int sum) {
		if(n % 2 == 0){
			sum = sum + 1;
		}
			
			
		
		return(sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
