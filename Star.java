import java.awt.event.MouseEvent;
import acm.program.GraphicsProgram;
import acm.graphics.*;


public class Star extends GraphicsProgram {
	private static final double OVAL_SIZE = 20;
	public void init() {
		addMouseListeners();

	}
	public void MouseClicked(MouseEvent e) {
		GOval oval = new GOval(OVAL_SIZE, OVAL_SIZE);
		oval.setFilled(true);
		add(oval, e.getX(), e.getY());
		
		
	}









}
