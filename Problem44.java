import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem44 extends GraphicsProgram{
	private static final int RADIUS = 50;
	GOval circle; 
	public void run() {
		addMouseListeners();
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle);
	}
	public void mouseClicked(MouseEvent e) {
		add(circle, e.getX() - RADIUS, e.getY() - RADIUS);
	}
}
