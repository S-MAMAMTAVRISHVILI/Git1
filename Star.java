import java.awt.event.MouseEvent;
import acm.program.GraphicsProgram;
import acm.graphics.*;


public class Star extends GraphicsProgram {
	private static final double OVAL_SIZE = 20;
	public void init() {
		addMouseListeners();

	}
	public void mouseClicked(MouseEvent e) {
		GOval oval = new GOval(OVAL_SIZE, OVAL_SIZE);
		oval.setFilled(true);
		add(oval, e.getX() - OVAL_SIZE / 2, e.getY() - OVAL_SIZE / 2);
		
		
	}









}
