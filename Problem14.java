import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem14 extends GraphicsProgram {
	public void run() {
		double Length = getWidth();
		double Height = getHeight();
		add(new GRect(Length*0.35, Height/4, Length*0.3, Height/2));
		add(new GRect(Length*0.45, Height*0.65, Length/10, 20));
		add(new GOval(Length*0.4, Height*0.35, 50 ,50));
		add(new GOval(Length*0.6-50, Height*0.35, 50, 50));
		add(new GRect(Length*0.49, Height*0.55, 10,20));
		}	
}		
		
	

