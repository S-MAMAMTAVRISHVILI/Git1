import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram {
	private static final int BALL_RADIUS = 70;
	private static final int PAUSE_TIME = 20;

	public void run() {
		GOval ball = new GOval(BALL_RADIUS, BALL_RADIUS);
		double x1 = 0;
		double y1 = (getHeight() - BALL_RADIUS) / 2;
		add(ball, x1, y1);
		while((ball.getX() <= getWidth() - 2 * BALL_RADIUS)) { 
			ball.move(1, 0);
			ball.pause(PAUSE_TIME);	
			
		}
			
		

	}
}
