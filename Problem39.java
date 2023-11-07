import acm.graphics.GOval;
import acm.program.ConsoleProgram;

public class Problem39 extends ConsoleProgram {
	private static final int BALL_RADIUS = 70;
	private static final int PAUSE_TIME = 500;

	public void run() {
		GOval ball = new GOval(BALL_RADIUS, BALL_RADIUS);
		double x1 = (getWidth() - BALL_RADIUS) / 2;
		double y2 = (getHeight() - BALL_RADIUS) / 2;
		while((ball.getX() <= getWidth() - 2 * BALL_RADIUS)) { 
			ball.move(1, 0);
			ball.pause(PAUSE_TIME);	
			
		}
			
		

	}
}
