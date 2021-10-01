package Plant;

import Zombie.GamePanel;

public class PlantUpdate extends Thread {
	Plant plant;
	public PlantUpdate(Plant plant) {
		this.plant=plant;
	}
	
	
		@Override
		public void run() {
			super.run();
			try {
				while(plant.getHealth()>0) {
				
					sleep(plant.getSpeed());
		
					plant.PlantAction();
				}
			   GamePanel.plants.remove(plant);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	

}
