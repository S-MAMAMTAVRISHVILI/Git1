import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem43 extends GraphicsProgram {
	private GOval oval;
	private GPoint point;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void init() {
		oval = new GOval(100, 100);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		add(oval, getWidth() / 2 - 50, getHeight() / 2 - 50);
		
		addMouseListeners();
	}
	public void mouseDragged(MouseEvent e) {
		oval.move(e.getX(),e.getY());
		add(oval);
		
		
		
		
	}



}
