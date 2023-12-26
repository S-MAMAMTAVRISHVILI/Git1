import acm.program.ConsoleProgram;

public class Problem15 extends ConsoleProgram {
	public void run() {
//		tst
		double n1 = readInt ("Enter n1:");
		double n2 = readInt ("Enter n2:");
		double arithmeticMean = (n1+n2)/2;
		println("The arithmetic mean is " + arithmeticMean);
	}
	
}