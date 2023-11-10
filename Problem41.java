import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem41 extends GraphicsProgram {

	private GOval oval;
	private RandomGenerator rand = RandomGenerator.getInstance();
	
	public void init() {
		oval = new GOval(1, 1);
		oval.setFilled(true);
		addMouseListeners();
		// oval.setColor(rand.nextColor());
		

	}

	public void mouseClicked(MouseEvent e) {
		// GObject obj = getElementAt(e.getX(), e.getY());
		
		add(oval, e.getX(), e.getY());
		
	}

}
