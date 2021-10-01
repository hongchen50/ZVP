package Zombie;

import java.util.Random;

public class ZombieCreater extends Thread {
	@Override
	public void run() {
		
		
		super.run();
		try {
			
			
			while(true) {
			
			Zombie zombie=null;
			Random r=new Random();
			int a=r.nextInt(100);
            if(a<60) {
            	 zombie=new CommonZombie();
            }else if(a<90){
            	 zombie=new RoadblockZombie();
            	
            }else {
            	 zombie=new IronBucketZombie();           	
			}
			
			GamePanel.zombies.add(zombie);
			new ZombieUpdate(zombie).start();
			sleep(1000);
			
			
			}
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
