import stanford.karel.Karel;

//1.კარელი დგას 1x1 უჯრაზე. 3x1 უჯრაზე დევს ბრილიანტი, კარელმა ბრილიანტი უნდა
//გადაიტანოს 4x1 უჯრაზე და დაამთავროს მუშაობა.

	/*
	 *pre: karel is at 1*1
	 *
	 */
public class Problem01 extends Karel{
	public void run(){
		move();
		move();
		pickBeeper();
		move();
		putBeeper();
	}
}
