import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GraphicEvents extends GraphicsProgram {
	private GRect rect;
	private GRect rect2;
	
	public void init() {
		rect = new GRect(100, 100);
		rect.setFilled(true);
		add(rect);

		rect2 = new GRect(100, 100);
		rect2.setFilled(true);
		add(rect2, 200, 200);

		addMouseListeners();
		addKeyListeners();
	}

	public void run() {

	}

	public void mouseClicked(MouseEvent e) {

		// e.getX();
		GObject obj = getElementAt(e.getX(), e.getY());
		// if(obj != null) {
		// obj.setColor(Color.RED);
		// }

		if (obj == rect) {
			obj.setColor(Color.RED);
		} else if (obj == rect2) {
			obj.setColor(Color.BLUE);
		}

	}
	public void KeyTyped(KeyEvent e){
		
	}
}
