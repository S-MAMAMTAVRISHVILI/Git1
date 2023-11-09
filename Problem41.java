import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem41 extends GraphicsProgram {

	private GOval oval;
	private RandomGenerator rand = RandomGenerator.getInstance();
	public void run() {
	oval = new GOval(1, 1);
	oval.setFilled(true);
	//oval.setColor(rand.nextColor());	
	getMouseMotionListeners();
		
		
		
		
		
	}
	public void mouseMoved(MouseEvent e) {
	//GObject obj = getElementAt(e.getX(), e.getY());
	
	add(oval, e.getX(), e.getY());
		
		
		
	}








}


