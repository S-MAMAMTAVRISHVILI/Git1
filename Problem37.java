import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int betNumber = readBet();
		int rouletteNumber = spinRoulette();
		if(rouletteNummber == spinRoulette){
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
		//validation logic
		return bet;
	}
}
