import stanford.karel.Karel;

//კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
//სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
//სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
//ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
//თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.

public class exp3 extends Karel{
	public void run(){
		while(beepersInBag()){
			while(frontIsClear()){
				ifNoBeeperPut();
				move();
			}
			if(frontIsBlocked()){
				ifNoBeeperPut();
				turnLeft();
				move();
				ifNoBeeperPut();
				turnLeft();
				move();
			}
			while(frontIsClear()){
				ifNoBeeperPut();
				move();
			}
			if(frontIsBlocked()){
				ifNoBeeperPut();
				turnRight();
				move();
				ifNoBeeperPut();
				turnRight();
				move();
			}		
		}
	}
	private void turnRight(){
		for(int i=0;i<3;i++){turnLeft();}
	}
	private void ifNoBeeperPut(){
	if(noBeepersPresent()){putBeeper();}	
	}
}

