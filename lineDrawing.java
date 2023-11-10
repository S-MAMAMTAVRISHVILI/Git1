import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class lineDrawing extends GraphicsProgram {
	private GLine line;

	public void init() {
		addMouseListeners();
	}

	public void mousePressed(MouseEvent e) {
		GLine line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
	}

}
