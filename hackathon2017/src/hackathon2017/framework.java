package hackathon2017;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;

public class framework extends Canvas implements MouseListener{
	
	//TextArea input = new TextArea();
	//Canvas cv = new Canvas();
	
	public framework(){
		this.setSize(800, 500);
		addMouseListener(this);
		
		//this.add(input);
		
		Thread thr = new Thread(){
			public void run(){
				System.out.println("thread");
				thegame();
			}
		};
		thr.start();
	}
	
	public long lasttimeloop = System.nanoTime();
	public final int TARGET_FPS = 60;
	public final long OPTIMAL_TIME = 1000000/TARGET_FPS;
	
	int enemycounter = 0;
	int enemiesdefeated = 0;
	enemy enemy;
	//framework fw;
	//TextArea input = new TextArea();
	
	String[] comm = {"If(x==4){}","String y = Hello World"};
	String userinput ="";
	
	
	/*
	public game(framework FW){
		fw=FW;
		thegame(fw);
	}*/
	
	public void thegame(){
		boolean isRunning = true;
		
		while(isRunning){
			
			if(enemycounter == 0)
			{
				Random rn = new Random();
				String command = comm[rn.nextInt(comm.length)];
				//int x = (int)Math.random() * 
				
				int randy = rn.nextInt(250)+1;
				enemy = new enemy(command,100,800,randy);
				enemycounter++;
				System.out.println("enemymade starts at " + enemy.startx + ", " + enemy.starty);
				System.out.println("enemymessage:" + enemy.command);
			}
			//framework frame = work;
//			 userinput = frame.input.getText().trim();
//			 if(userinput.equals(comm)){
//				 enemy = null;
//				 enemycounter--;
//				 frame.input.setText("");
//				 enemiesdefeated += 1;
//			 }else{
//				 frame.input.setText("");
//			 }
			System.out.println("enemy is now at " + enemy.curr);
			update();
				
			this.repaint();
			try{Thread.sleep(TARGET_FPS*50);}
			catch(Exception e){e.printStackTrace();}
				
//			if(userinput.equals(enemy.command))
//			{
//				enemy = null;
//				enemycounter--;
//			}
			
			if(enemy==null)
			{}
			else{
				if(enemy.curr <= 100 && enemy!= null)
				{
					isRunning = false;
					drawGameOver("Game Over",getGraphics());
				}
				if(enemiesdefeated == 10){
				drawGameOver("You Win", getGraphics());
				isRunning = false;
				}
			}
			
		}
	}
	

	public void update(){
		enemy.move();
	}
	
	public void paint(Graphics g){
		g.drawRect(enemy.curr, enemy.starty, 50, 50);
	}
	public void drawGameOver(String s,Graphics g)
	{
		g.drawString(s, 250, 250);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>enemy.curr && e.getX() <= enemy.curr+50)
		{
			if(e.getY()>enemy.starty && e.getY()<=enemy.starty+50 ){
				System.out.println("hit");
				enemy =  null;
				enemycounter--;
				enemiesdefeated++;
				System.out.println("Score: "+ enemiesdefeated);
			}
		}
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
	


