package Bullet;

import Zombie.GamePanel;

public class BulletUpdate extends Thread {
	Bullet bullet;
    public BulletUpdate(Bullet bullet) {
		this.bullet=bullet;
	}
	
	@Override
	public void run() {
		super.run();
		bullet.thisth=this;
		/*while(bullet.isExist()==true) {
			bullet.BulletMove();
			try {
				sleep(bullet.getSpeed());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				
			}
		}*/
		while(bullet.isExist()==true) {
			if(bullet.getX()>900) {
				bullet.setExist(false);
				GamePanel.bullets.remove(bullet);
			}
	    bullet.BulletMove();
	   
		if(GamePanel.zombies.size()>0) {
			for(int i=0;i<GamePanel.zombies.size();i++) {
				if(GamePanel.zombies.get(i).getRect().intersects(bullet.getRect())) {
					
					bullet.Bulletattack(GamePanel.zombies.get(i));
					 GamePanel.bullets.remove(bullet);
					 bullet.setExist(false);
					if(GamePanel.zombies.get(i).getHealth()<=0) {
						GamePanel.zombies.get(i).ZombieDeath();
					}
			       
			       
				}
			}
		}
		 try {
				sleep(bullet.getSpeed());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
