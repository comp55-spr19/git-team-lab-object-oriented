//comment one
//Hayden's comment
//Colton was here
//Ayyy lmao
//commit 1
//commit 4
//commit 3
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	//E10
	public void run() {
		GImage robot = new GImage("robert.jpg", 200, 100);
		add(robot);
		GLabel label = new GLabel("MFW I change the label again!", 200, 400);
	
		add(label);
		System.out.println("Get nay nay'd");
		//Ayyy lmao
	}
}