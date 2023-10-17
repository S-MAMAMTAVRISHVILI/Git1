import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem12Version2 extends GraphicsProgram {
	private static final int BASE_Y_COORDINATE = 400;
	
	private static final int BASE_X_COORDINATE = 300;
	
	private static final int WALL_HEIGHT = 200;
	
	private static final int WALL_WIDTH = 200;
	
	private static final int ROOF_HEIGHT = 100;
	
	private static final int DOOR_WIDTH = 40;
	
	private static final int DOOR_HEIGHT = 100;
	
	private static final int DOOR_LEFT_OFFSET = 100;
	
	private static final int WINDOW_WIDTH = 40;
	
	private static final int WINDOW_HEIGHT = 40;
	
	private static final int WINDOW_LEFT_OFFSET = 30;
	
	private static final int WINDOW_BASE_OFFSET = 130;
	
	public void run() {
		drawHouse();
	}
	private void drawHouse() {
		drawWalls();
		drawRoof();
		drawDoor();
		drawWindow();
	}	
		
		
		
	
	private void drawWindow() {
		GRect window = new GRect(BASE_X_COORDINATE + WINDOW_LEFT_OFFSET, BASE_Y_COORDINATE - WINDOW_BASE_OFFSET,
									WINDOW_WIDTH, WINDOW_HEIGHT);
		add(window);
	}
	private void drawDoor() {
		GRect door = new GRect(BASE_X_COORDINATE + DOOR_LEFT_OFFSET,
															BASE_Y_COORDINATE -	DOOR_HEIGHT,
															DOOR_WIDTH,
															DOOR_HEIGHT);
		add(door);
		
	}
	private void drawRoof() {
		// TODO Auto-generated method stub
		
	}
	private void drawWalls() {
		// TODO Auto-generated method stub
		
	}
}
