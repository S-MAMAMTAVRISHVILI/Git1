import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class P41Seminar extends GraphicsProgram {
	private static final int RADIUS = 20;
	
	
	
	public void run() {
		addMouseListeners();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		GOval brush = new GOval(2 * RADIUS, 2 * RADIUS);
		int x = e.getX() - RADIUS;
		int y = e.getY() - RADIUS;
		add(brush ,x, y);
	
	
	}
	public void mousePressed(MouseEvent e) {
		GOval brush = new GOval(2 * RADIUS, 2 * RADIUS);
		int x = e.getX() - RADIUS;
		int y = e.getY() - RADIUS;
		add(brush ,x, y);
	
	}
	
}
