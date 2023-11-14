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
		addBrush(e.getX() ,e.getY());
	
	
	}
	public void mousePressed(MouseEvent e) {
		addBrush(e.getX() ,e.getY());
	
	}
	private void addBrush(int centerX, int centerY) {
		GOval brush = new GOval(2 * RADIUS, 2 * RADIUS);
		int x = centerX - RADIUS;
		int y = centerY - RADIUS;
		brush.setFilled(true);
		add(brush ,x, y);
	}
}
