import acm.program.ConsoleProgram;





public class Problem32 extends ConsoleProgram {
	private static final int MAX_NUM = 1000;
	public void run() {
		int n = readInt("Enter number :");
		for(int i = 1; i < MAX_NUM; i++) {
			if(isPrime(i)) {
				println(i);
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	private boolean isPrime(int i) {
		for(int j = 2; j <= Math.sqrt(i); j++){
		}
			
		return true;
	
	
	}
	
}