import acm.program.ConsoleProgram;






public class Problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		boolean x = checkPrime(n);
		println("The number is" + x);
		
		
		
		
		
		
		
		
		
	}

	

	private boolean checkPrime(int n) {
		double x = Math.sqrt(n);
		for(int i = 2; i <= x; i++){
			int remainder = n % i;
			
			if(remainder == 0){
				return false;
				
			}
		}	
		return true;	
		
	}
}
