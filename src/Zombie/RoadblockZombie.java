package Zombie;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

import Plant.Plant;

public class RoadblockZombie extends Zombie {

	Image imgZombieMove= LoadingImage("/img/RoadblockZombie.jpg");
	
	

	 
	 public int CreatLocation() {
		 Random random = new Random();
		 int a;
		 a=GamePanel.LocationY[random.nextInt(5)];
		 return a;
	 }
	 
	 
	 public RoadblockZombie() {
		setAction(0);
		setX(900);
		setY(CreatLocation());
		setWidth(64);
		setHeight(128);
		setHealth(10);
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
