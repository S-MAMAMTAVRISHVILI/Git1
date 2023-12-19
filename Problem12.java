import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	public void run() {
	add(new GRect(200, 200, 200, 225));
	add(new GLine(200, 200, 300, 100));
	add(new GLine(300, 100, 400, 200));
	add(new GLine(200, 200, 400, 200));
	add(new GRect(270, 345, 60, 80 ));
	add(new GOval(315, 385, 5, 5));
	add(new GRect(225, 235, 50, 60));
	add(new GRect(325, 235, 50, 60));
	}
}	
	

