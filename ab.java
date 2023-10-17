import stanford.karel.Karel;




public class ab extends Karel{
	public void run(){
	moveToTheBeeperPile();
	pickTenBeepers();
	move();
	putTenBeepers();
	}
	private void moveToTheBeeperPile(){
		for(int i=0;i<4;i++){move();}
	}
	private void pickTenBeepers(){
		for(int k=0;k<10;k++){pickBeeper();}
	}
	private void putTenBeepers(){
		for(int j=0;j<10;j++){putBeeper();}
	}
}





