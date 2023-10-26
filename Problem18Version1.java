import acm.program.ConsoleProgram;





public class Problem18Version1 extends ConsoleProgram {
	public void run() {
		int num1 = readInt("Enter number1: ");
		int num2 = readInt("Enter number2: ");
		if(num1 >= num2){
			println("Max is: " + num1);
		}else{
		println("Max is: " + num2);	
		} 
	}
}
