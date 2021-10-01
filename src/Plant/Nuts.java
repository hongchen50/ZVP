package Plant;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import Util.LoadingImage;

public class Nuts extends Plant {
    LoadingImage loader = new LoadingImage();
    Image imgNuts = loader.LoadingImage("/img/Nuts.jpg");
	
     public Nuts() {
    	setHealth(1000);
 		setHeight(100);
 		setWidth(100);
 		setPrice(50);
 	    setImgPlant(imgNuts);
 	    setID("Nuts");
		
	}
	@Override
	public void PlantAction() {
		// TODO Auto-generated method stub

	}

	@Override
	public void DrawMe(Graphics g) {
		g.drawImage(imgNuts, getX(), getY(), 113, 130, null);

	}

	@Override
	public Rectangle getRect() {
		return new Rectangle(getX(),getY(),getWidth(),getHeight());
	}

}
