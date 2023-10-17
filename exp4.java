import stanford.karel.SuperKarel;

public class exp4 extends SuperKarel {
	public void run(){
		move();
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
		move();
		while(beepersPresent()){pickBeeper();}
	}
}
