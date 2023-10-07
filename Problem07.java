import stanford.karel.Karel;

//კარელი დგას 1x1 უჯრაზე, შეავსებინეთ მას მთელი სამყარო თითო ბრილიანტით. ანუ მთელ
//სამყაროში ყველა უჯრაზე უნდა იდოს ზუსტად ერთი ბრილიანტი. ჩათვალეთ რომ საწყისი
//სამყარო ცარიელი არ არის და გარკვეულ(ჩვენთვის უცნობ) უჯრებში თითო(მხოლოდ ერთი)
//ბრილიანტი დევს. ამასთან გაითვალისწინეთ, რომ სამყაროს ზომები თქვენთვის უცნობია და
//თქვენი პროგრამა უნდა მუშაობდეს ნებისმიერი ზომის სამყაროსათვის.


public class Problem07 extends Karel {
	public void run(){
		while(beepersInBag()){
			while(leftIsClear()){
				if(noBeepersPresent()){putBeeper();}
				move();
			}
			if(frontIsBlocked()){
				if(noBeepersPresent()){putBeeper();}
				turnLeft();
				move();
				if(noBeepersPresent()){putBeeper();}
				turnLeft();
				move();
			}		
			while(frontIsClear()){
				if(noBeepersPresent()){putBeeper();}
				move();	
			}
			if(rightIsBlocked()){
				if(noBeepersPresent()){putBeeper();}
				for(int i=0;i<3;i++){turnLeft();}
				move();
				if(noBeepersPresent()){putBeeper();}
				for(int i=0;i<3;i++){turnLeft();}
				move();
			}
		}
	}	
}			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
