import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem34Version1 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int number = 1000;

	public void run() {
		
		for (int i = 0; i < number; i++) {
			double radius = rgen.nextDouble(0, getWidth() / 8);
			double x = rgen.nextDouble(0, getWidth() - 2 * radius);
			double y = rgen.nextDouble(0, getHeight() - 2 * radius);
			GOval oval = new GOval(2 * radius, 2 * radius);
			oval.setFilled(true);
			oval.setColor(rgen.nextColor());
			add(oval, x, y);

		}

	}
}
