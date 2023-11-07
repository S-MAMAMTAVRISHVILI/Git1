import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;


public class Problem35Version1 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUM_EXPERIMENTS = 100000;
	
	public void run() {
		int x = 0;
		for(int i = 0; i < NUM_EXPERIMENTS; i++){
			boolean flip = rgen.nextBoolean();
			if(flip = true){
			x += x;	
			}
		}
		print(x / NUM_EXPERIMENTS);
		
		
		
	}
	
	
	
}
