package Plant;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import Bullet.Pea;
import Util.LoadingImage;
import Zombie.GamePanel;

public class PeaShooter extends Plant{
     LoadingImage loader = new LoadingImage();
     Image imgPeaShooter=loader.LoadingImage("/img/PeaShooter.jpg");
	 public PeaShooter() {
		setImgPlant(imgPeaShooter);
		setHealth(100);
		setHeight(100);
		setWidth(100);
		setPrice(100);
		setID("PeaShooter");
		setSpeed(1000);
	}
	
	
	@Override
	public void PlantAction() {
		Pea pea = new Pea(getX(), getY());
		GamePanel.bullets.add(pea);
		
	}

	@Override
	public void DrawMe(Graphics g) {
		g.drawImage(imgPeaShooter, getX(), getY(), 113, 130, null);
		
	}

	@Override
	public Rectangle getRect() {
		return new Rectangle(getX(),getY(),getWidth(),getHeight());
	}

}
