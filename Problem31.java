import acm.program.ConsoleProgram;






public class Problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		checkPrime(n);
		
		
		
		
		
		
		
		
		
		
	}

	

	private void checkPrime(int n) {
		double x = Math.sqrt(n);
		for(int i = 2; i <= x; i++){
		if(n % i == 0){
			println("The number is prime");
			break;
		}
			
		
		}	
			
		
	}
}
