//comment one
//Hayden's comment
//Colton was here
//Ayyy lmao
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
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);
		GLabel label = new GLabel("Wassup", 200, 400);
		add(label);
		System.out.println("Get nay nay'd");
		//Ayyy lmao
	}
}