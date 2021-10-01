package Util;

import Zombie.GamePanel;

public class GAMEMAIN {
	public static void BulletAndZombie() {
		if(GamePanel.bullets.size()!=0&&GamePanel.zombies.size()!=0)
		{
		
		  for(int j=0;j<GamePanel.bullets.size();j++)
		  {
			  for(int w=0;w<GamePanel.zombies.size();w++) 
			 {  
          if(GamePanel.bullets.size()!=0&&j<GamePanel.bullets.size()&&GamePanel.zombies.get(w).getRect().intersects(GamePanel.bullets.get(j).getRect()))
          {   
        	  GamePanel.bullets.get(j).setExist(false);
        	  GamePanel.bullets.remove(j);
          }
			 }
		  }
		  
		}
	}
	
	
	public static void PlantAndZombie() {
		if(GamePanel.zombies.size()!=0&&GamePanel.plants.size()!=0) {
			for(int i=0;i<GamePanel.zombies.size();i++) {
				for(int j=0;j<GamePanel.plants.size();j++) {
					if(GamePanel.plants.size()!=0&&j<GamePanel.plants.size()&&GamePanel.plants.get(j).getRect().intersects(GamePanel.zombies.get(i).getRect())) {
						//GamePanel.zombies.get(i).ZombieEat();
					}
					
				}
			}
		}
	}

}
