package Sun;


import Zombie.GamePanel;

public class DeleteSun extends Thread {
	Sun sun;
 
	public DeleteSun(Sun sun) {
		this.sun=sun;
	
	}
	@Override
	public void run() {
		
		super.run();
		try {
			sleep(5000);
			Sun.gamePanel.remove(sun);
			sun=null;
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}

}
