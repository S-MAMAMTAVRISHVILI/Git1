import stanford.karel.Karel;

//კარელმა უნდა შეკრიბოს ორი რიცხვი, 2x1 უჯრაზე დევს n ცალი ბრილიანტი, 3x1 უჯრაზე m
//ცალი ბრილიანტი, კარელმა 4x1 უჯრაზე უნდა დადოს n+m ბრილიანტი. ჩათვალეთ, რომ
//კარელს ჩანთაში უსასრულო რაოდენობის ბრილიანტი აქვს.

public class Problem06 extends Karel {
	public void run(){
		move();
		for(int k =0; k < 2; ++k){
			while(beepersPresent()){
				pickBeeper();
				move();
				putBeeper();
				for(int i = 0; i < 2; ++i) turnLeft();
				move();
				for(int j = 0; j < 2; ++j) turnLeft();
			}
			move();
		}
	}
}