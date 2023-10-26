import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem21Version1 extends GraphicsProgram{
	private static final int VERTICALLINES = 10;
	private static final int HORIZONTALLINES = 10;
	
	public void run() {
		double x1 = getWidth() / VERTICALLINES + 1;
		double y1 = 0;
		double x2 = getWidth() / VERTICALLINES + 1;
		double y2 = getHeight();
		for(int i = 1; i <= VERTICALLINES; i++){
			add(new GLine(x1 * i, y1, x2 * i, y2  ));
		}
		
		
		
		
		
		
		
		
		
	}
}
