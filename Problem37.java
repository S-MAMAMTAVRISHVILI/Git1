import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int betNumber = readBet();
		int rouletteNumber = spinRoulette();
		if(betNumber == rouletteNumber){
			println("You won!");
		}else{
			println("You lost!");
		}
		
		
		
		
		
		
		
		
		
		
	}

	private int spinRoulette() {
		int rouletteResult = rgen.nextInt(0, 36);
		println("Roulette result is: " + rouletteResult);
		return rouletteResult;
	}

	private int readBet() {
		int bet = readInt("Enter number(0 - 36)");
		if(bet < 0 || bet > 36) {
			bet = readInt("Enter number(0 - 36)");
		} else {
		return bet;
		}
	return 0;
	}
}
