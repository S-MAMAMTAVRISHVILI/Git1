import stanford.karel.SuperKarel;

//კარელმა უნდა გაამრავლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n * m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

public class Problem09 extends SuperKarel{
	public void run(){
		move();
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			move();
			putBeeper();
			turnAround();
			move();
			turnLeft();
			move();
			while(beepersPresent()){
				pickBeeper();
				move();
				putBeeper();
				turnAround();
				move();
				turnRight();
				move();
				putBeeper();
				turnAround();
				move();
				turnLeft();
			}
			turnLeft();
			move();
			turnAround();
			while(beepersPresent()){
				pickBeeper();
				move();
				putBeeper();
				turnAround();
				move();
				turnAround();
			}
			move();
			turnRight();
			move();
			turnAround();
		}
		turnLeft();
		move();
		turnAround();
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
		move();
		turnLeft();
	}
}
