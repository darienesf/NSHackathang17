package hackathon2017;

public class enemy {
	String command;
	//Image image;
	int startx;
	int starty;
	
	int curr;
	
	int vel = 1;
	
	public enemy(String s , int diff, int x, int y){
		command  = s;
		vel *= diff;
		startx = x;
		starty = y;
		
		curr = startx;
	}
	
	public void move()
	{
		curr -= vel;
	}
}
