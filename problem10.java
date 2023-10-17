import stanford.karel.SuperKarel;

//კარელმა უნდა გაყოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n / m ბრილიანტი. ჩათვალეთ, რომ n
//ზუსტად იყოფა m-ზე და კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

public class problem10 extends SuperKarel{
	public void run(){
		move();
		while(beepersPresent()){
			move();
			turnAround();
			while(beepersPresent()){
				pickBeeper();
				turnRight();
				move();
				putBeeper();
				turnAround();
				move();
				turnRight();
				move();
				pickBeeper();
				turnRight();
				move();
				putBeeper();
				turnAround();
				move();
				turnLeft();
				move();
				turnAround();	
			}
			turnAround();
			move();
			putBeeper();
			turnAround();
			move();
			turnRight();
			move();
			turnAround();
			beepersToTheBottom();
			move();
			turnRight();
			move();
			turnAround();
		}
		turnLeft();
		move();
		turnAround();
		beepersToTheBottom();
		move();
		turnLeft();
		
		
		
		
	}
	private void beepersToTheBottom(){
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
		
	}





}
