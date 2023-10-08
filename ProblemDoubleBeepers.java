import stanford.karel.SuperKarel;

public class ProblemDoubleBeepers extends SuperKarel {
	public void run(){
		for(int i=0; i<2;i++){putBeeper();}
		while(frontIsClear()){
			pickBeeper();
			turnLeft();
			move();
			putBeeper();
			turnAround();
			move();
			turnLeft();
			move();
			putDoubleBeepers();
			backTOPreviousPosition();
			if(noBeepersPresent()){
				turnLeft();
				move();
				turnAround();
				while(beepersPresent()){
					pickBeeper();
					move();
					putBeeper();
					backTOPreviousPosition();
				}
			move();
			turnLeft();
			move();
			}
			
		}
	}	
	private void putDoubleBeepers() {
		for(int k=0;k<2;k++){putBeeper();}
	}
	private void backTOPreviousPosition(){
		turnAround();
		move();
		turnAround();
	}
}
