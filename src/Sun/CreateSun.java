package Sun;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JLabel;

import Zombie.GamePanel;

public class CreateSun extends Thread {
	GamePanel gamePanel;
	public CreateSun(GamePanel gamePanel) {
		this.gamePanel=gamePanel;
	}
	
	@Override
	public void run() {
		super.run();
		
		Random r = new Random();
		int x,y;
	
		while(true) {
			Sun sun = new Sun();
			x=r.nextInt(600-116);
			y=r.nextInt(750-116);
			sun.setBounds(x,y,116,116);
			
			gamePanel.add(sun);
		
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	

}
