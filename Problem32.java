import acm.program.ConsoleProgram;

public class Problem32 extends ConsoleProgram {
	private static final int MAX_NUM = 1000;

	public void run() {

		for (int i = 2; i < MAX_NUM; i++) {
			if (isPrime(i)) {
				println(i);
			}

		}

	}

	private boolean isPrime(int i) {
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				return false;
			}

		}

		return true;

	}

}