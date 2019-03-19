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
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);
<<<<<<< HEAD
		GLabel label = new GLabel("I'm a god at Apex Legends", 200, 400);
=======
		GLabel label = new GLabel("Subcribe to Pewdiepie", 200, 400);
>>>>>>> branch 'master' of https://github.com/comp55-spr19/git-team-lab-object-oriented.git
		add(label);
		System.out.println("Get nay nay'd");
		//Ayyy lmao
	}
}