package hackathon2017;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.html.HTMLDocument;


public class Application extends Applet implements KeyListener{

	//Graphics g;
	framework fw;
	JPanel jp;
	public void init(){
		this.setSize(800,500);
		
		
		
		
	}
	public void start(){
		
		//this.setLayout(new GridLayout());
		framework frame = new framework();
		//frame.setBounds(0, 301, 800, 200);
		frame.setSize(800,300);
		//frame.setBackground(Color.DARK_GRAY);
		//this.add(frame);
		
		JPanel jp =  new JPanel();
		jp.setSize(800, 200);
		//jp.setBounds(0, 301, 800, 200);
		jp.setBackground(Color.blue);
		jp.setVisible(true);
		this.add(jp);
		jp.add(frame);
		
		
		}
	
	
	@Override
	public void paint(Graphics g) {
		//start(stickman2);
		
	}

	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
