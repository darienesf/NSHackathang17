package hackathon2017;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;

public class stickman {

	Image image;
	int x; 
	int y;
	
	public stickman() {
		x = 250;
		y = 250;
		
	}
	
	public void move(char lett){
		switch(lett){
		case 'a':
			x += -1;
			break;
		case 'd':
			x += 1;
			break;
		}
		System.out.println(x);
		
	}

}
