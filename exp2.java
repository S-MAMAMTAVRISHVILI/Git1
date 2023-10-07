import stanford.karel.Karel;

public class exp2 extends Karel{
	public void run(){
		while(beepersInBag()){
			while(frontIsClear()){
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
			if(frontIsBlocked()){
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
