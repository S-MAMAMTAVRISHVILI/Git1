import acm.program.ConsoleProgram;

public class Problem15II extends ConsoleProgram {
	public void run() {
		int num1 = readInt("Enter first number:");
		int num2 = readInt("Enter second number:");
		double avgInDoubles = (num1 + num2) / 2.0;
		println(avgInDoubles);
	}
}
