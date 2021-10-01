package Plant;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import Sun.Sun;
import Util.LoadingImage;

public class SunFlower extends Plant {
	LoadingImage Loader = new LoadingImage();
	Image imgSunFlower = Loader.LoadingImage("/img/SunFlower.jpg");
	public SunFlower() {
		
		setHealth(100);
		setHeight(100);
		setWidth(100);
		setPrice(50);
	    setImgPlant(imgSunFlower);
	    setID("SunFlower");
	    setSpeed(10000);
	
	}
	
	
	
	
	@Override
	public void DrawMe(Graphics g) {
		g.drawImage(imgSunFlower, getX(), getY(), 113, 130, null);
		
	}
	
	@Override
	public void PlantAction() {
		Sun sun = new Sun();
		sun.setBounds(getX()+10, getY()+30, 116, 116);
		Sun.GetGamePanel().add(sun);
		
		
	}
	@Override
	public Rectangle getRect() {
		
		return new Rectangle(getX(),getY(),getWidth(),getHeight());
		
	}

	

}
