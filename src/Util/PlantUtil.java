package Util;

import Plant.Nuts;
import Plant.PeaShooter;
import Plant.Plant;
import Plant.SunFlower;

public class PlantUtil {
	
	

	public static Plant CreateRealPlant(Plant plant) {
		
		switch(plant.getID()) {
		   case  "SunFlower":{
			   return new SunFlower();
		   }
		   case "PeaShooter":{
			   return new PeaShooter();
		   }
		   case "Nuts":{
			   return new Nuts();
		   }
		}
		return null;
		
		
		
	}
	
	
	

}
