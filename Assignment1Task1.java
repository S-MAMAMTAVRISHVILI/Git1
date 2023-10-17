import stanford.karel.SuperKarel;
/*
 * File: Assignment1Task1.java
 * Author: Sandro Mamamtavrishvili
 * Section number: 16
 * Task: karel's first position is its home, the robot should
 * leave the house, pick up the newspaper, then come back to its starting position
 * and finish the work.
*/
public class Assignment1Task1 extends SuperKarel{
	public void run(){
		leaveHouse();
		pickNewspaperAndTurn();
		backToTheFirstPosition();
	}
	/*
     * Makes Karel leave its house and stand right on the position 
	 * of the newspaper.
	 * pre: Karel is at the top left corner of the house, facing east.
	 * post: Karel is outside the house, standing on the newspaper, facing east.
	*/
	private void leaveHouse(){
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
	}
	/*
	 * Makes Karel pick up the newspaper and face the door.
	 * pre: Karel is outside the house, standing on the newspaper, facing east.
	 * post: Karel is outside the house, standing right in front of the door, facing west.
	*/
	private void pickNewspaperAndTurn(){
		pickBeeper();
		turnAround();
	}
	/*
	 * Makes Karel enter home and go back to the starting position.
	 * pre: Karel is outside the house, standing right in front of the door, facing west.
	 * post: Karel is at the top left corner of the house, facing east.
	*/
	private void backToTheFirstPosition(){
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
		turnAround();
	}
}


