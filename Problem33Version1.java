import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;



public class Problem33Version1 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		double radius = rgen.nextDouble(10,200);
		GOval oval = new GOval(2 * radius, 2 * radius);
		oval.setFilled(true);
		oval.setColor(rgen.nextColor());
		add(oval, getWidth() / 2 - radius, getHeight() / 2 - radius);
		
		
		
	}
	
	
	
	
	
}
