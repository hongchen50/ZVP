package Zombie;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;

import Plant.Plant;

public abstract class Zombie {
	private int x;
	private int y;
	private int width;
	private int height;
	private int speed;
	private int health;
	private int attack;
	private int action;
	
	private ArrayList<Image> MoveImages =  new ArrayList<>();
	private ArrayList<Image> EatImages =  new ArrayList<>();
	private ArrayList<Image> DeathImages =  new ArrayList<>();
	
	
	
	public abstract void ZombieMove( );
	public abstract void ZombieEat( Plant plant);
	public abstract void ZombieDeath( );
	public abstract void DrawMe(Graphics g);
	public abstract Rectangle getRect();
	
	public  Image LoadingImage (String s )
	{
	
		URL url = getClass().getResource(s);
		BufferedImage image=null;
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return image;
	}
	
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public ArrayList<Image> getMoveImages() {
		return MoveImages;
	}
	public void setMoveImages(ArrayList<Image> moveImages) {
		MoveImages = moveImages;
	}
	public ArrayList<Image> getEatImages() {
		return EatImages;
	}
	public void setEatImages(ArrayList<Image> eatImages) {
		EatImages = eatImages;
	}
	public ArrayList<Image> getDeathImages() {
		return DeathImages;
	}
	public void setDeathImages(ArrayList<Image> deathImages) {
		DeathImages = deathImages;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getAction() {
		return action;
	}
	public void setAction(int action) {
		this.action = action;
	}

	
	

}
