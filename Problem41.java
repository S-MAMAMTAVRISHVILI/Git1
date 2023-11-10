import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem41 extends GraphicsProgram {


	

	public void run() {

		addMouseListeners();

	}

	public void mouseMoved(MouseEvent e) {
		GOval oval = new GOval(1, 1);
		oval.setFilled(true);
		add(oval, e.getX(), e.getY());

	}

}
