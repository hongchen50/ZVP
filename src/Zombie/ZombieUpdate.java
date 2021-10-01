package Zombie;





public class ZombieUpdate extends Thread {
	Zombie zombie;
	public ZombieUpdate(Zombie zombie) {
		this.zombie=zombie;
	}	
	//static int i=0;
	
	@Override
	

	
	public void run() {
		super.run();
		//i++;
		
		/*while(true) {
		zombie.ZombieMove();
		try {
			sleep(zombie.getSpeed());
			//System.out.println(i);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}*/
		
		while(zombie.getHealth()>0) {
		
			if(GamePanel.plants.size()==0) {
				zombie.setAction(0);
			}
			
			for(int i = 0;i<GamePanel.plants.size();i++) {
				
				if(zombie.getRect().intersects(GamePanel.plants.get(i).getRect() ) ) {
					zombie.ZombieEat(GamePanel.plants.get(i));
					zombie.setAction(1);
					if(GamePanel.plants.get(i).getHealth()<=0) {
					   GamePanel.plants.remove(GamePanel.plants.get(i));
					}
					try {
						sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					zombie.setAction(0);
				}
			}
			if(zombie.getAction()==0) {
				zombie.ZombieMove();
				try {
					sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		zombie.ZombieDeath();
		
	}

}
