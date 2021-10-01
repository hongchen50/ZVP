package Zombie;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ZombieController extends KeyAdapter{
	CommonZombie commonZombie;
	public ZombieController(CommonZombie commonZombie) {
		this.commonZombie=commonZombie;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		super.keyPressed(e);
		switch (e.getKeyChar()) {
		case 'w':commonZombie.setY(commonZombie.getY()-20);break;
		case 's':commonZombie.setY(commonZombie.getY()+20);break;
		case 'a':commonZombie.setX(commonZombie.getX()-20);break;
		case 'd':commonZombie.setX(commonZombie.getX()+20);break;
		
			
		
		}
	}
	

}
