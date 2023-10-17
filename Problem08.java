import stanford.karel.SuperKarel;

//კარელმა უნდა გამოაკლოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე
//m ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n-m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს და ჩათვალეთ, რომ n>=m.

public class Problem08 extends SuperKarel {
	public void run(){
		for(int i=0;i<2;i++){move();}
		turnAround();
		while(beepersPresent()){
			pickBeeper();
			move();
			pickBeeper();
			turnAround();
			move();
			turnAround();
		}
		move();
		while(beepersPresent()){
		pickBeeper();
		turnAround();
		for(int k=0;k<2;k++){move();}
		putBeeper();
		turnAround();
		for(int j=0;j<2;j++){move();}
		}
		
	}

}
