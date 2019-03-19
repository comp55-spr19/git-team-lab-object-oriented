//comment one
<<<<<<< HEAD
//Hayden's comment
=======
//Colton was here
>>>>>>> branch 'master' of https://github.com/comp55-spr19/git-team-lab-object-oriented.git
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
		GLabel label = new GLabel("How I feel when using github hackslash", 200, 400);
		add(label);
		//Ayyy lmao
	}
}