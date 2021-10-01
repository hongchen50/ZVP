package Zombie;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.tools.DocumentationTool.Location;

import Plant.Plant;

public class CommonZombie extends Zombie {
	 Image imgZombieMove= LoadingImage("/img/CommonZombie.jpg");
	 
	

	 
	 public int CreatLocation() {
		 Random random = new Random();
		 int a;
		 a=GamePanel.LocationY[random.nextInt(5)];
		 return a;
	 }
	 
	 
	 public CommonZombie() {
		setAction(0);
		setX(900);
		setY(CreatLocation());
		setWidth(64);
		setHeight(128);
		setHealth(100);
		setAttack(10);
		setSpeed(15);
	}
   
	@Override
	public void ZombieMove( ) {
		
	
		this.setX(this.getX()-1);
		
	}
	
	public void DrawMe(Graphics g) {
		g.drawImage(imgZombieMove, getX(), getY(), 64, 128, null);
	}

	@Override
	public void ZombieEat( Plant plant) {
		plant.setHealth(plant.getHealth()-getAttack());
		
	}

	@Override
	public void ZombieDeath( ) {
		GamePanel.zombies.remove(this);
		
	}

	@Override
	public Rectangle getRect() {
		return new Rectangle(getX(),getY(),getWidth(),getHeight());
	}
	
	
	
	

}
