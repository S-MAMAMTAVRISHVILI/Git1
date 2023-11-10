import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.event.MouseEvent;

import acm.graphics.*;

public class mouseDragg extends GraphicsProgram {
	private GObject object;
	private GPoint point;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void init() {
		GRect rect = new GRect(100, 100);
		rect.setFilled(true);
		rect.setColor(rgen.nextColor());
		add(rect);
		addMouseListeners();

	}

	public void mousePressed(MouseEvent e) {
		point = new GPoint(e.getPoint());
		object = getElementAt(point);

	}

	public void mouseDragged(MouseEvent e) {
		if (object != null) {
			object.move(e.getX() - point.getX(), e.getY() - point.getY());
			point = new GPoint(e.getPoint());
		}
	}
	public void mouseClicked(MouseEvent e) {
	if(object != null){}
	object.sendToFront();
	}	
		
	
}
