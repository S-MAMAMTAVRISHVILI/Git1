import acm.program.ConsoleProgram;

public class Problem29 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		if(n == 0){
			println("Fibonacci sequence: " + n);
		}else{
		int num1 = 0;
		int num2 = 1;
		int sum = num1 + num2;
		for(int i = 1; i < n; i++){
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		println("Fibonacci sequence: " + sum);
		}
		
		
		
		
		
		
		
	}	
}