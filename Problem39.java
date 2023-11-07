import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram {
	private static final int BALL_DIAMETER = 70;
	private static final int PAUSE_TIME = 5;

	public void run() {
		GOval ball = new GOval(BALL_DIAMETER, BALL_DIAMETER);
		double x1 = 0;
		double y1 = (getHeight() - BALL_DIAMETER) / 2;
		ball.setFilled(true);
		add(ball, x1, y1);
		
		while((ball.getX() <= getWidth() - BALL_DIAMETER)) { 
			ball.move(1, 0);
			ball.pause(PAUSE_TIME);	
			
		}
			
		

	}
}
