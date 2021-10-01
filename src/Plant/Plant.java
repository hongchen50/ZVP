package Plant;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import Sun.Sun;

public abstract class Plant {
	
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	private int price;
	private Image imgPlant;
	private String ID;
    private int speed;
	
	private ArrayList<Image> MoveImages =  new ArrayList<>();
	private ArrayList<Image> ActionImages =  new ArrayList<>();
	
	public  abstract void PlantAction();
	public abstract void DrawMe(Graphics g);
	public abstract Rectangle getRect();
    
   
	
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
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public ArrayList<Image> getMoveImages() {
		return MoveImages;
	}
	public void setMoveImages(ArrayList<Image> moveImages) {
		MoveImages = moveImages;
	}
	public ArrayList<Image> getActionImages() {
		return ActionImages;
	}
	public void setActionImages(ArrayList<Image> actionImages) {
		ActionImages = actionImages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Image getImgPlant() {
		return imgPlant;
	}
	public void setImgPlant(Image imgPlant) {
		this.imgPlant = imgPlant;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

}
