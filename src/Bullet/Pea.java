package Bullet;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.print.attribute.Size2DSyntax;



import Util.LoadingImage;
import Zombie.GamePanel;
import Zombie.Zombie;

public class Pea extends Bullet {
     
	LoadingImage loader = new LoadingImage();
     Image imgPea=loader.LoadingImage("/img/Pea.png");
	 public Pea(int x,int y) {
		setImgBullet(imgPea);
		setHeight(20);
		setWidth(20);
		setDamage(10);
		setSpeed(5);
		setX(x+113);
		setY(y+30);
		setExist(true);
		new BulletUpdate(this).start();
		
	}
	
	
	
	@Override
	public void BulletMove() {
		this.setX(this.getX()+1);
		
	}

	@Override
	public void BulletDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rectangle getRect() {
		 return new Rectangle(getX(),getY(),getWidth(),getHeight());
	}


	@Override
	public void DrawMe(Graphics g) {
		g.drawImage(imgPea, getX(), getY(), 40, 40, null);	
		
	}



	@Override
	public void Bulletattack(Zombie zombie) {
		zombie.setHealth(zombie.getHealth()-getDamage());
		
	}
	
	
}

